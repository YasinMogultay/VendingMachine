import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException, ParseException {

        Scanner in = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();
        Item[] vmItems = vm.getItems();

        System.out.println("*********************************************");
        System.out.println("Welcome to Vending Machine");
        System.out.println("*********************************************");

        vm.displayInventory();



        String rsp;
        System.out.println("Type 'yes' to see order directions");
        rsp = in.nextLine();

        if (rsp.equalsIgnoreCase("yes")){
            for (int i = 0; i < vmItems.length; i++) {
                System.out.println("Enter " + (i+1) + " for " + vmItems[i].getName());
            }
        }

        System.out.println("Enter 10 to stop the Vending Machine");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            if (choice < 1 || choice > 9) {
                System.out.println("Incorrect choice");
            }
            else if(choice == 10) {
                System.out.println("Stopping Vending Machine...");
            }
            else {
                vm.dispenseItem(choice - 1);
            }
        } while(choice != 10);

    }
}
