package String;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");

        //Strings are immutable

        Scanner r=new Scanner(System.in);
        String name,names;
        name=r.next(); // only word before space
        names=r.nextLine(); // whole line
        System.out.println(name);
        System.out.println(names);
        
    }
}
