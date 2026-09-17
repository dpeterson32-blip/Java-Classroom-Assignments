//Dustin Peterson
//pg.184 09/15/2026
import java.util.Scanner;

public class AssignVolunteer4 
{
    public static void main(String[] arge)
    {
        int donationType;
        String volunteer;
        String message;
        final int Clothing_Code = 1;
        final int Other_Code = 2;
        final String Clothing_Pricer = "Regina";
        final String Other_Pricer = "Marco";
        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this");
        System.out.println("Enter" + Clothing_Code + "for clothing," + Other_Code + "for anything else...");
        donationType = input.nextInt();
        if (donationType == Clothing_Code)
        {
            volunteer = Clothing_Pricer;
            message = "a clothing donation";
        } 
        else 
            if (donationType == Other_Code) 
        {
            volunteer = Other_Pricer;
            message = " a non-clothing donation";
        } 
        else 
        {
            volunteer = "invalid";
            message = "This is an invalid notation type";
        }
        System.out.println("You entered" + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
        

    }   
}
