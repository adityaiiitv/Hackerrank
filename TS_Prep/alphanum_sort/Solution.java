import java.util.regex.Pattern;
import java.util.*;
import java.util.regex.*;
public class Solution{
     public static void main(String []args){
        /*String[] examples = { 
           "1some", "2some", "20some", "21some", "3some", "some", "1abc", "abc"
        };*/
         String[] examples = { 
           "some1", "some2", "some20", "some21", "some3", "some", "abc1", "abc"
        };
        List<String> examplesList = new ArrayList<String>(Arrays.asList(examples));
        Pattern p = Pattern.compile("\\d+"); // ^\\d+ for nums at start, \\d+$ for nums at end
        Comparator<String> c = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2)
            {
                Matcher m = p.matcher(s1);
                if(!m.find())
                {
                    return s1.compareTo(s2);
                }
                else{
                    Integer num1 = Integer.parseInt(m.group());
                    
                    m = p.matcher(s2);
                    if(!m.find())
                    {
                        return (s1.compareTo(s2));
                    }
                    else{
                        Integer num2 = Integer.parseInt(m.group());
                        int comparison = num1.compareTo(num2);
                        if(comparison != 0)
                        {
                            return comparison;
                        }
                        else{
                            return s1.compareTo(s2);
                        }
                    }
                }
            }  
        };
        System.out.println(examplesList);
        Collections.sort(examplesList,c);
        System.out.println(examplesList);
    }
}