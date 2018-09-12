import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long len = s.length();
        long local_count=0;
        for(int i = 0;i<len;i++)
        {
            if(s.charAt(i)=='a')
            {
                local_count++;
            }
        }
        long rem_len = n%len;
        long rem_count=0;
        for(int i =0;i<rem_len;i++)
        {
            if(s.charAt(i)=='a')
            {
                rem_count++;
            }
        }
        long ans = (n/len)*local_count + rem_count;
        System.out.println("ans" + ans);
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
