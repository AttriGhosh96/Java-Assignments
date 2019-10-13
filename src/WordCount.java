//Question 1
public class WordCount
{
    public static void main(String args[])
    {
        if (args.length < 2)
        {
            System.out.println("Not enough number of arguments");
        }
        String find = "";
        find = args[0];
        int count = 0;
        int i;
        for (i = 1; i < args.length; i++)
        {
            if (find.equalsIgnoreCase(args[i]))
            {
                count++;
            }
        }
        System.out.println("The no of times the word occurred:" + count);
    }
}


