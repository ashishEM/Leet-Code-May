import java.util.ArrayList;

public class May6
{
    public static void main (String[] args)
    {
        int [] a={1,3,3,5,6,7,3,2,2,};
        int b= majorityElement(a);
        System.out.println(b);

    }
    public static int majorityElement(int[] nums)
    {
        int maj = 0;

        int l = nums.length/2;
        int [] fr = new int [nums.length];
        int visited = -1;

        for(int i = 0; i < nums.length; i++){
            int count = 1;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j])
                {
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
            {
                fr[i] = count;
            }
        }

        for(int a  = 0; a < fr.length;a++)
        {
            if(fr[a] > l)
            {
                maj = nums[a];
                break;
            }
        }

        return maj;

    }
}
