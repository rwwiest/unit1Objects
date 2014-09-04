import java.util.Random;

public class diesimulator
{
    public static void main(String[] args)
    {
        Random number = new Random();
        int dice = number.nextInt(6)+1;
        System.out.println(dice);
    }
}