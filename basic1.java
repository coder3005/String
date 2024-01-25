package String;

public class basic1 {
    public static void printletters(String str) {
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String  fullname="Abhi Gupta";
        System.out.println(fullname.length());

        //concatenation
        String firstname="Abhi";
        String lastname="Gupta";
        String fullName=firstname+" "+lastname;
        System.out.println(fullName);
        //System.out.println(fullName.charAt(1));
        printletters(fullName);
    }
}
