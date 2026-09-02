//Dustin Peterson
// pg 81 09/02/2026
//ex8a

import java.util.Scanner;

public class ChiliToGo2 {
    public static void main(String[] args) {
        int noAdultMeals;
        int noChildMeals;
        double priceAdult = 4.35;
        double priceChild = 3.10;
        double totalAdult = 0.0;
        double totalChild = 0.0;
        double totalAll = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of childern's meals: ");
        noChildMeals = input.nextInt();
        System.out.print("Please enter the number of adult meals: ");
        noAdultMeals = input.nextInt();
        totalAdult = noAdultMeals * priceAdult;
        totalChild = noChildMeals * priceChild;
        totalAll = totalAdult + totalChild;
        System.out.printf("The total cost of the adult meals is $%.2f\n", totalAdult);
        System.out.printf("The total cost of the children's meals is: $%.2f\n", totalChild);
        System.out.printf("The total cost of all meals is: $%.2f\n", totalAll);
        input.close();



    }
}
