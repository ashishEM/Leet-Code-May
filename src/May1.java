import java.util.ArrayList;

public class May1
{
    public static void main (String[] args)
    {
        int n = 9;

        int a = firstBadVersion(n);
        System.out.println(a);
    }

    public static boolean isBadVersion(int n)
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

    public static int firstBadVersion(int n) {

        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }
}
