//Question 4
import java.util.*;
public class BinSearch {
    public static void main(String args[])
    {
        int len = args.length;
        int a[] = new int[len];
        int i;
        for (i = 0; i < len; i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }
        int l=0;
        int h=len-1;
        int x=input();
        sort(a,len);
        int p=search(a,l,h,x);

        if(p==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found");


    }

    public static int input()
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        x = sc.nextInt();
        return x;
    }

    public static void sort(int arr[],int n)
    {
        int i, j, temp;
        for (i = 0; i < n - 1; i++)
        {
            for (j = 0; j < n - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static int search(int arr[], int l, int h, int x)
    {

        while (l <= h)
        {
            int m = (l + h) / 2;
            if (arr[m] == x)
                return 1;
            if (x < arr[m])
                h = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

}