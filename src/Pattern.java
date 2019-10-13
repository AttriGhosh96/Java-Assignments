//Question 7 part 1 and part 2
public class Pattern
{
    public static void main(String args[])
    {
        int i;
        int l=args[0].length();
        System.out.println("Pattern 1");
        for(i=l;i>0;i--)
            System.out.println(args[0].substring(0,i));
        String S="";
        System.out.println("Pattern 2");
        for(i=0;i<l;i++)
        {
            S = args[0].charAt(i) + S;
            System.out.println(S);
        }
    }


}
