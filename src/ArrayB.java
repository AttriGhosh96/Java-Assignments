//Question 6 with buffereader
import java.io.*;
public class ArrayB
{
    private static int a[];
    private static int n;
    //function to take input of the original array
    private static void input()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int i;
      System.out.println("Enter the total number of elements in the array");
      n=Integer.parseInt(br.readLine());
      a=new int[n];
      System.out.println("Enter the elements into the array");
      for(i=0;i<n;i++)
          a[i]=Integer.parseInt(br.readLine());
    }
    //function to check whether a number is prime or not
    private static boolean prime(int x)throws Exception
    {
        int i;
        for(i=2;i<x-1;i++)
            if(x%i==0)
                return false;
        return true;
    }
    //function to form the prime array and the composite array
    private static void perform()throws Exception
    {
       int p[] = new int[n];
       int c[] = new int[n];
        int i, j, k;
        int count1=0, count2=0;

        for(i=0,j=0,k=0;i<n;i++)
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
        display(a,n);
        System.out.println("\nPrime Array");
        display(p,count2);
        System.out.println("\nComposite Array");
        display(c,(n-count1-count2));


    }
    //function to display an array
    private static void display(int arr[],int l)
    {
        for(int i=0;i<l;i++)
            System.out.println(" "+ arr[i] + "\t");
    }

    //main function
    public static void main(String args[])throws Exception
    {
        ArrayB obj=new ArrayB();
        obj.input();

        obj.perform();

    }
}
