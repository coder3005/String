import java.util.*;

public class vowelscount {
    public static void main(String[] args) {
        int count=0;
        Scanner r=new Scanner(System.in);
        String str=r.nextLine();
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                count++;
            }
        }
        System.out.println(count+" "+"times");
        r.close();
    }
}
