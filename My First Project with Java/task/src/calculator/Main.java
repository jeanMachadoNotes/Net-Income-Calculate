package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static class Item {
         String itemName;
         double earnedAmount;

         public void getItemName() {
            System.out.println(itemName);
         }
        public void getEarnedAmount() {
            System.out.println(earnedAmount);
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //To Do: See why not pulling object information.
        Item item1 = new Item();
        item1.itemName = "Bubblegum";
        item1.earnedAmount = 202;

        Item item2 = new Item();
        item2.itemName = "Toffee";
        item2.earnedAmount = 118;

        Item item3 = new Item();
        item3.itemName = "Ice Cream";
        item3.earnedAmount = 2250;

        Item item4 = new Item();
        item4.itemName = "Milk Chocolate";
        item4.earnedAmount = 1680;

        Item item5 = new Item();
        item5.itemName = "Doughnut";
        item5.earnedAmount = 1075;

        Item item6 = new Item();
        item6.itemName = "Pancake";
        item6.earnedAmount = 80;


        System.out.println("Earned amount:");
        System.out.println(item1.itemName + ": $" + item1.earnedAmount);
        System.out.println(item2.itemName + ": $" + item2.earnedAmount);
        System.out.println(item3.itemName + ": $" + item3.earnedAmount);
        System.out.println(item4.itemName + ": $" + item4.earnedAmount);
        System.out.println(item5.itemName + ": $" + item5.earnedAmount);
        System.out.println(item6.itemName + ": $" + item6.earnedAmount);
        double earnedIncome = item1.earnedAmount + item2.earnedAmount + item3.earnedAmount + item4.earnedAmount + item5.earnedAmount + item6.earnedAmount;
        System.out.println("Income: $" + (String.format("%.2f", earnedIncome)));

        System.out.println("Staff Expenses: ");
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other Expenses: ");
        double otherExpenses = scanner.nextDouble();

        double netIncome = earnedIncome - (staffExpenses + otherExpenses);
        System.out.println("Net Income: $" + String.format("%.2f", netIncome));
    }
}