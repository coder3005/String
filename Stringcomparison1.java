/* String Comparison in Java */
class A 
{
    public static void main(String[] args) {
        
        String a="Lion"; // String literal
        String b=new String("Lion"); // new keyword

        if(a==b)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}
