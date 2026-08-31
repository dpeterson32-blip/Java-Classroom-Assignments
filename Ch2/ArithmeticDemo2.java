//Dustin Peterson
// pg 71 08/31/2026
import java.util.Scanner;

public class ArithmeticDemo2{
    public static void main (String[] args)
    {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a another double: ");
        firstNumber = input.nextInt();
        System.out.print("Please enter a another double: ");
        secondNumber = input.nextInt();
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (double) sum / 2;
            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
            System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
            System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }

    
}
