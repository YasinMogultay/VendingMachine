//import org.json.simple.parser.ParseException;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class sample {
////    private Item[] items;
////
////    public VendingMachine() {
////        items = new Item[2];
////        items[0] = new Item("Snickers", 10, 1.35);
////        items[1] = new Item("Hersheys", 10, 2.25);
////    }
//
////    public void displayInventory() {
////        System.out.println("Name" + "     Amount " + "Price");
////        for (int i = 0; i < items.length; i++) {
////            System.out.print(items[i].getName());
////            System.out.print('\t');
////            System.out.print(items[i].getAmount());
////            System.out.print('\t');
////            System.out.print(items[i].getPrice());
////            System.out.println();
////        }
////    }
//
////    public void dispenseItem(int itemCode) {
////        Scanner in = new Scanner(System.in);
////        if (items[itemCode].getAmount() <= 0) {
////            System.out.println("Sorry, out of stock");
////        }
////        else
////        {
////            System.out.println("MRP: " + items[itemCode].getPrice());
////            System.out.print("Enter money: ");
////            double amt = in.nextDouble();
////            if (amt < items[itemCode].getPrice()) {
////                System.out.println("Insufficient money paid, can't dispense " +
////                        items[itemCode].getName());
////                System.out.println("Refunding " + amt);
////            }
////            else
////            {
////                System.out.println("Dispensing one " + items[itemCode].getName());
////                double changeAmt = amt - items[itemCode].getPrice();
////                if (changeAmt > 0)
////                    System.out.println("Here is your change amount of " + changeAmt);
////                items[itemCode].reduceAmount();
////            }
////        }
////    }
//
//    Item[] getItems() {
//        return items;
//    }
//
//    public static void main(String args[]) throws IOException, ParseException {
//
//        Scanner in = new Scanner(System.in);
//        VendingMachine vm = new VendingMachine();
//        Item[] vmItems = vm.getItems();
//
//        System.out.println("*********************************************");
//        System.out.println("Welcome to Vending Machine");
//        System.out.println("*********************************************");
//        vm.displayInventory();
//        for (int i = 0; i < vmItems.length; i++) {
//            System.out.println("Enter " + (i+1) + " for " + vmItems[i].getName());
//        }
//
//        System.out.println("Enter 6 to stop the Vending Machine");
//
//        int choice;
//        do {
//            System.out.print("Enter your choice: ");
//            choice = in.nextInt();
//
//            if (choice < 1 || choice > 6) {
//                System.out.println("Incorrect choice");
//            }
//            else if(choice == 6) {
//                System.out.println("Stopping Vending Machine...");
//            }
//            else {
//                vm.dispenseItem(choice - 1);
//            }
//        } while(choice != 6);
//
//    }
//
//}
