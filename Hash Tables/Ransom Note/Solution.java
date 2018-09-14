import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> mag = new Hashtable<String, Integer>();
        int mag_len = magazine.length;
        for(int i=0;i<mag_len;i++)
        {
            if(!mag.containsKey(magazine[i]))
            {
                mag.put(magazine[i], 1);
            }
            else{
                mag.put(magazine[i],mag.get(magazine[i])+1);
            }
        }
        int note_len = note.length;
        for(int i=0;i<note_len;i++)
        {
            if(!mag.containsKey(note[i]))
            {
                System.out.println("No");
                return;
            }
            int counter = mag.get(note[i]) - 1;
            if(counter == 0)
            {
                mag.remove(note[i]);
            }
            else
            {
                mag.put(note[i], counter);
            }

        }
        System.out.println("Yes");
        return;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
