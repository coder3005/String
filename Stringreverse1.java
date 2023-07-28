/* String Reverse */
class A 
{
    public static void main(String[] args) {
        
        int l;
        String r="Learn Java";
        String r2="";
        l=r.length();

        for(int i=l-1;i>=0;i--)
        {
            r2=r2+r.charAt(i);
        }
        System.out.println(r2);
    }
}
