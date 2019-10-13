//Question 3
import java.util.*;
public class WordPalin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String word = "";
        System.out.println("Enter the word");
        word = sc.nextLine();
        int len = word.length();
        String nword = "";
        int i;
        for (i = len - 1; i >= 0; i--)
        {
            nword = nword + word.charAt(i);
        }
        System.out.println(nword);
        if (word.equalsIgnoreCase(nword))
            {
                System.out.println("The given word is a palindrome");
            }
        else
            {
                System.out.println("The given word is not a palindrome");
            }
    }
}

