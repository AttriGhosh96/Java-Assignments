//Question 6
public class Array
{
    public static void main(String args[]) {
        int l = args.length;
        int a[] = new int[l];
        int p[] = new int[l];
        int c[] = new int[l];
        int i, j, k;
        int count1=0, count2=0;
        for (i = 0; i < l; i++)
            a[i] = Integer.parseInt(args[i]);
        for(i=0,j=0,k=0;i<l;i++)
        {
            if(a[i]<0) {
                count1++;
                continue;
            }
            if(prime(a[i]))
            {
                count2++;
                p[j]=a[i];
                j++;
            }
            else
            {
                c[k]=a[i];
                k++;
            }
        }


        System.out.println("Original Array");
        for(i=0;i<l;i++)
            System.out.print(" " +a[i]);
        System.out.println("\nPrime Array");
        for(j=0;j<count2;j++)
            System.out.print(" " +p[j]);
        System.out.println("\nComposite Array");
        for(k=0;k<(l-count1-count2);k++)
            System.out.print(" " +c[k]);

    }
    public static boolean prime(int n)
    {
        int i;
        for(i=2;i<n-1;i++)
            if(n%i==0)
                return false;
         return true;
    }
}
