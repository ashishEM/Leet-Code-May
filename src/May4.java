import java.util.ArrayList;

public class May4 {

    public static void main (String[] args)
    {
        int a=5;
        int b = findComplement(a);

        System.out.println(b);

    }
    public static int findComplement(int num)
    {
        // Converting the number to binary and then into String
        String b = Integer.toBinaryString(num);
        // converting binary String into character ARRAY
        char[] c = b.toCharArray();


        // complement will be stored in this variable
        String complement = "";
        // iterating each binary character in the char array
        for(char a: c)
        {
            String s = Character.toString(a);

            int norm = Integer.parseInt(s);

            if(norm == 0)
            {
                complement = complement + "1";
            }
            else
            {
                complement = complement + "0";
            }
        }


        int foo = Integer.parseInt(complement, 2);

        return foo;
    }
}