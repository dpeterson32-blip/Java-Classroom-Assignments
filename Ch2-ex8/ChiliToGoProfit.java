//Dustin Peterson
// pg 81 09/02/2026
//ex8b

import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        int noAdultMeals;
        int noChildMeals;
        double priceAdult = 7.0;
        double priceChild = 4.0;
        double costAdult = 4.35;
        double costChild = 3.10;
        double totalAdult = 0.0;
        double totalChild = 0.0;
        double totalProfitAdult = 0.0;
        double totalProfitChild = 0.0;
        double totalCostAdult = 0.0;
        double totalCostChild = 0.0;
        double totalAll = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of childern's meals: ");
        noChildMeals = input.nextInt();
        System.out.print("Please enter the number of adult meals: ");
        noAdultMeals = input.nextInt();
        totalAdult = noAdultMeals * priceAdult;
        totalChild = noChildMeals * priceChild;
        totalAll = totalAdult + totalChild;
        totalProfitAdult = noAdultMeals * (priceAdult - costAdult);
        totalProfitChild = noChildMeals * (priceChild - costChild);
        totalCostAdult = noAdultMeals * costAdult;
        totalCostChild = noChildMeals * costChild;
       System.out.printf("The total profit from adult meals is: $%.2f\n", totalProfitAdult);
        System.out.printf("The total profit from children's meals is: $%.2f\n", totalProfitChild);
        System.out.printf("The total profit made for all meals is: $%.2f\n", totalProfitAdult + totalProfitChild);
        input.close();



    }
}
