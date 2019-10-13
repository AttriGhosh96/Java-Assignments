//Question 5
public class FeetInch
{
    double ft, inch;
    public FeetInch()
    {
        ft=0.0;
        inch=0.0;
    }

    public FeetInch(Double f, Double i)
    {
        ft=f;
        inch=i;
    }

    public static void compare(FeetInch obj1,FeetInch obj2)
    {
        if(obj1.ft==obj2.ft && obj1.inch==obj2.inch)
            System.out.println("Both the heights are equal");
        if((obj1.ft>obj2.ft && obj1.inch<obj2.inch) ||(obj1.ft>obj2.ft && obj1.inch>obj2.inch))
            System.out.println("The first height is greater than the second height");
        else
            System.out.println("The second height is greater than the first height");
    }

    public static void main(String args[])
    {
        double f1,i1,f2,i2;
        f1=Double.parseDouble(args[0]);
        i1=Double.parseDouble(args[1]);
        f2=Double.parseDouble(args[2]);
        i2=Double.parseDouble(args[3]);
        System.out.println("The first height entered is  " +f1 +"feet " +i1 + "inches" );
        System.out.println("The second height entered is " +f2 +"feet " +i2 + "inches" );
        FeetInch ob1=new FeetInch(f1,i1);
        FeetInch ob2=new FeetInch(f2,i2);
        compare(ob1,ob2);
    }
}
