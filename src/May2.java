import java.util.ArrayList;

public class May2
{

    public static void main (String[] args)
    {
        String a ="aaAAA";
        String b ="aA";
        int c = numJewelsInStones(b, a);
        System.out.println(c);
    }


    public static int numJewelsInStones(String J, String S)
    {


        int count = 0;
        for (char j:J.toCharArray())
        {
            for (char s:S.toCharArray())
            {
                if (j==s)
                {
                    count++;
                }


            }
        }
        return count++;
    }
}

