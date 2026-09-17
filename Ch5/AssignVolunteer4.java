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
        final int Furniture_Code = 2;
        final int Electronics_Code = 3;
        final int Other_Code = 4;
        final String Clothing_Pricer = "Regina";
        final String Other_Pricer = "Marco";
        final String Furniture_Pricer = "Wei";
        final String Electronics_Pricer = "Lydia";
        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this");
        System.out.println("Enter an integer... ");
        donationType = input.nextInt();
        switch(donationType)
        {
            case(Clothing_Code):
            {
            volunteer = Clothing_Pricer;
            message = "a clothing donation";
            break;
            }
        case(Furniture_Code):
        {
            volunteer = Furniture_Pricer;
            message = "a furniture donation";
            break;
        }
        case(Electronics_Code):
        {
            volunteer = Electronics_Pricer;
            message = "an electronics donation";
            break;
        }
        case(Other_Code):
        {
            volunteer = Other_Pricer;
            message = "another donation type";
            break;
        }
        default:
        {
            volunteer = "invalid";
            message = "This is an invalid notation type";
            break;
        }
    }
    
        System.out.println("You entered" + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
        

    }   
}
