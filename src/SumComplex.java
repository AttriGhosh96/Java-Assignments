//Question 2
import java.util.*;
public class SumComplex
{
        int x1,y1;
        public SumComplex()
        {
            x1=0;
            y1=0;
        }
        public SumComplex(int a, int b)
        {
            this.x1=a;
            this.y1=b;
        }
        public  void add(SumComplex ob)
        {
            int x, y;
            x=x1 + ob.x1;
            y=y1 + ob.y1;
            System.out.println("The sum of the complex numbers=" +x +"+" +y +"i");
        }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a1,b1,a2,b2;
        System.out.println("Enter the real part of the first complex number");
        a1=sc.nextInt();
        System.out.println("Enter the imaginary part of the first complex number");
        b1=sc.nextInt();
        System.out.println("Enter the real part of the second complex number");
        a2=sc.nextInt();
        System.out.println("Enter the imaginary part of the second complex number");
        b2=sc.nextInt();

        SumComplex c1=new SumComplex(a1,b1);
        SumComplex c2=new SumComplex(a2,b2);
        c1.add(c2);
    }
}


