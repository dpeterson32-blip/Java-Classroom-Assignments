//Dustin Peterson
// pg 62
import java.util.Scanner;

class IntegerDemo {
    public static void main(String[] args)
    {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
      
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte: ");
        aByte = input.nextByte();
        System.out.print("Please enter a short: ");
        aShort = input.nextShort();
        System.out.print("Please enter a long: ");
        aLong = input.nextLong();
        
    }
}