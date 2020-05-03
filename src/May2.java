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
    public boolean isBadVersion(int n)
    {
        boolean bad;
        ArrayList<Integer> badn = new ArrayList<>();
        badn.add(4);
        badn.add(5);
        badn.add(6);
        badn.add(7);
        badn.add(8);
        badn.add(9);

        if(badn.contains(n))
        {
            bad = true;
        }
        else{
            bad = false;
        }

        return bad;
    }

    public int firstBadVersion(int n) {

        int mid=n/2;
        int cond=0;
        int num = 1;
        boolean way= isBadVersion(mid);
        if (way)
        {
            num=1;
            cond= mid-1;
        }
        else
        {
            num=mid+1;
            cond=n-1;
        }
        for(int i =num;i<cond;i++)
        {
            if(isBadVersion(i))
            {
                return i;
            }
        }
        return 1;
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

