//Dustin Peterson
// pg 62
public class IntegerDemointeractivewithname {
    public static void main(String[] args)
    {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        String name;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte: ");
        aByte = input.nextByte();
        System.out.print("Please enter a short: ");
        aShort = input.nextShort();
        System.out.print("Please enter a long: ");
        aLong = input.nextLong();
        System.out.print("Please enter your name: Dustin Peterson ");
        input.nextLine();
        name = input.next();
        System.out.println("Thank you" + name);
        
    }
}
