// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println(Prime.Findprime(number));


    }
}
class Prime
{
    static String Findprime(int number)
    {
        int temporary=0;
        for(int iterator = 2 ; iterator <= number / 2 ; iterator++)
        {
            if(number % iterator == 0)
            {
                temporary=1;
                break;
            }
        }
        if (temporary != 1)
            return "The number is a Prime";
        else
            return "The number is not Prime";
    }
}