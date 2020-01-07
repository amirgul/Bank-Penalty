import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter your balance");
        double balance = keyboard.nextDouble();
        System.out.println("enter your penalty");
        double penalty = keyboard.nextDouble();
        System.out.println("enter your deposit");
        double deposit = keyboard.nextDouble();
        int count = 0;
        while (balance < 0)
        {
            balance = balance - penalty;
            balance = balance + deposit;
            count++;

        }
        System.out.println("it will take: "+ count +" weeks for your account to be positive");


    }
}
