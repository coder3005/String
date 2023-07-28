/* String Reverse */
class A 
{
    public static void main(String[] args) {
        
        StringBuffer r=new StringBuffer("Learn Coding");  // method 1
        System.out.println(r.reverse());

        StringBuilder ref=new StringBuilder("Java Coding");  // method 2
        System.out.println(ref.reverse());
    }
}
