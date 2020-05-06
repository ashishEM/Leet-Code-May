import java.util.ArrayList;

public class May5 {
    public static void main (String[] args)
    {
        String a ="aakAAA";
        int b= firstUniqChar(a);
        System.out.println(b);
    }

    public static int firstUniqChar(String s)
    {
        char[] c = s.toCharArray();
        int position =-1;
        int n=0;
        for (int i =0;i<c.length-1;i++)
        {
            for (int j =i+1; j<c.length;j++)
            {
                if (c[i]==c[j])
                {
                    break;
                }
                n=j+1;

            }
            if (n==c.length)
            {
                position =i;
                break;
            }
        }
        return position;
    }
}
