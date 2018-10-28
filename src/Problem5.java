public class Problem5
{
    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/


    public static void main(String[] args)
    {
        int counter = 0;
        boolean stillValid = true;
        while (true)
        {
            stillValid = true;
            int i = 1;
            while(i <= 20 && stillValid)
            {
                if (counter % i == 0)
                    stillValid = true;
                else
                    stillValid = false;

                i++;
            }
            if (stillValid)
            {
                System.out.println(counter);
            }

            counter++;
        }


    }

}
