//Dustin Peterson
// 10/14/2026

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class WarehouseApp 
{
       public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Array inventory
        GameItem[] inventory = new GameItem[5];
        int count = 0;

        JOptionPane.showMessageDialog(null, "Welcome to Gaming Warehouse Inventory Control!");

        boolean running = true;

        while (running) {

            String menu = "Choose an option:\n"
                    + "1. Add Item\n"
                    + "2. View Inventory\n"
                    + "3. Update Stock\n"
                    + "4. Save Inventory to File\n"
                    + "5. Load Inventory from File\n"
                    + "6. Exit";

            String choice = JOptionPane.showInputDialog(menu);

            if (choice == null) break;

            switch (choice.trim()) {

                case "1":
                    if (count >= inventory.length) {
                        JOptionPane.showMessageDialog(null, "Inventory full!");
                        break;
                    }

                    String name = JOptionPane.showInputDialog("Enter game name:");
                    String qtyStr = JOptionPane.showInputDialog("Enter quantity:");
                    String console = JOptionPane.showInputDialog("Enter console type:");

                    int qty = Integer.parseInt(qtyStr);

                    inventory[count] = new GameItem(name, qty, console);
                    count++;

                    JOptionPane.showMessageDialog(null, "Item added!");
                    break;

                case "2":
                    StringBuilder sb = new StringBuilder("Current Inventory:\n");
                    for (int i = 0; i < count; i++) {
                        sb.append(i).append(": ").append(inventory[i]).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;

                case "3":
                    System.out.println("Enter item index to update:");
                    int index = kb.nextInt();

                    if (index < 0 || index >= count) {
                        JOptionPane.showMessageDialog(null, "Invalid index!");
                        break;
                    }

                    System.out.println("Add or Remove stock? (A/R)");
                    String ar = kb.next();

                    System.out.println("Enter amount:");
                    int amt = kb.nextInt();

                    if (ar.equalsIgnoreCase("A")) {
                        inventory[index].addStock(amt);
                    } else {
                        inventory[index].removeStock(amt);
                    }

                    JOptionPane.showMessageDialog(null, "Stock updated!");
                    break;

                case "4":
                    saveToFile(inventory, count);
                    JOptionPane.showMessageDialog(null, "Inventory saved to file!");
                    break;

                case "5":
                    count = loadFromFile(inventory);
                    JOptionPane.showMessageDialog(null, "Inventory loaded from file!");
                    break;

                case "6":
                    running = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice!");
            }
        }

        JOptionPane.showMessageDialog(null, "Goodbye!");
    }

    // FILE SAVE
    public static void saveToFile(GameItem[] inventory, int count) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("inventory.txt"));
            for (int i = 0; i < count; i++) {
                pw.println(inventory[i].getName() + "," +
                           inventory[i].getQuantity() + "," +
                           inventory[i].getConsoleType());
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // FILE LOAD
    public static int loadFromFile(GameItem[] inventory) {
        int count = 0;
        try {
            Scanner file = new Scanner(new File("inventory.txt"));
            while (file.hasNextLine() && count < inventory.length) {
                String line = file.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int qty = Integer.parseInt(parts[1]);
                String console = parts[2];

                inventory[count] = new GameItem(name, qty, console);
                count++;
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Error loading file.");
        }
        return count;
    }
}
