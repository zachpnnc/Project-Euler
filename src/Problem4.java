public class Problem4
{
    public static void main(String[] args)
    {
        int number1 = 100;
        int number2 = 100;
        int result;
        int currentMaxResult = 0;
        int i = 0;

        while (number1 < 1000)
        {
            while (number2 < 1000)
            {
                result = number1 * number2;
                String stringResult = Integer.toString(result);

                int length = stringResult.length();

                boolean palindrome = true;
                while (palindrome)
                {
                    if (stringResult.charAt(i) == stringResult.charAt((length - 1) - i))
                    {
                        palindrome = true;
                        if (length - i == 0)
                        {
                            currentMaxResult = result;
                        }
                    }
                    else break;
                    i++;
                }
                number2++;
                i = 0;
            }
            number1++;
        }
        System.out.println(currentMaxResult);
    }
}
