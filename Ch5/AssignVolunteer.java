//Dustin Peterson
//pg.166 09/15/2026
import java.util.Scanner;

public class AssignVolunteer 
{
    public static void main(String[] arge)
    {
        int donationType;
        String volunteer;
        final int Clothing_Code = 1;
        final int Other_Code = 2;
        final String Clothing_Pricer = "Regina";
        final String Other_Pricer = "Marco";
        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this");
        System.out.println("Enter" + Clothing_Code + "for clothing," + Other_Code + "for anything else...");
        donationType = input.nextInt();
        if(donationType == Clothing_Code)
            volunteer = Clothing_Pricer;
        else
            volunteer = Other_Pricer;
        System.out.println("You entered" + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        

    }   
}
