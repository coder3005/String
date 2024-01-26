package PS9;
import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String str=r.nextLine();
        String str2=r.nextLine();
        //convert strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
        str=str.toLowerCase();
        str2=str2.toLowerCase();
        //first check- if the lengths are the same
        if(str.length()==str2.length()) {
            //convert strings into char array
            char[] strcharArray=str.toCharArray();
            char[] str2charArray=str2.toCharArray();
            //sort the char array
            Arrays.sort(strcharArray);
            Arrays.sort(str2charArray);
            //if the sorted char arrays are same or identical then the strings are anagrams
            boolean result=Arrays.equals(strcharArray, str2charArray);
            if(result) {
                System.out.println("Strings are anagrams of each other");
            }
            else {
                System.out.println("Strings are not anagrams of each other");
            }
        }
        else {
            //case when lengths are not equal
            System.out.println("Strings are not anagrams of each other");
        }
        r.close();
    }
}
