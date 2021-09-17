import java.util.Scanner;

//My Vending Machine implementation
public class VendingMachine implements VendingMachineImplementation {

    //initialize Item class
    private Item[] items;

    public VendingMachine() {
        items = new Item[9];
        items[0] = new Item("Snickers", 10, 1.35);
        items[1] = new Item("Hersheys", 10, 2.25);
        items[2] = new Item("Hersheys A.", 10, 1.80);
        items[3] = new Item("Hersheys S.D", 10, 1.75);
        items[4] = new Item("Reese's", 10, 1.05);
        items[5] = new Item("Nutrageous", 10, 1.30);
        items[6] = new Item("Baby Ruth", 10, 2.50);
        items[7] = new Item("Milky Way", 10, 1.0);
        items[8] = new Item("M&M", 10, 1.25);

    }

    @Override
    public void displayInventory() { // the method that displays inventory
        System.out.println("Name" + "     Amount " + "Price");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i].getName());
            System.out.print('\t');
            System.out.print(items[i].getAmount());
            System.out.print('\t');
            System.out.print(items[i].getPrice());
            System.out.println();
        }
    }

    @Override
    public void dispenseItem(int itemCode) { //the method that select items
        Scanner in = new Scanner(System.in);
        if (items[itemCode].getAmount() <= 0) { // checks if item has greater amount than 0
            System.out.println("Sorry, out of stock");
        } else {
            System.out.println("Price: " + items[itemCode].getPrice()); //shows selected item price
            System.out.print("Enter money: ");
            double amt = in.nextDouble();
            if (amt < items[itemCode].getPrice()) { //if entered amount is lesser than item price returning it
                System.out.println("Insufficient money paid, can't dispense " +
                        items[itemCode].getName());
                System.out.println("Refunding " + amt);
            } else {
                System.out.println("Dispensing one " + items[itemCode].getName());
                double changeAmt = amt - items[itemCode].getPrice();// calculating change
                if (changeAmt > 0)
                    System.out.println("Here is your change amount of " + changeAmt);
                items[itemCode].reduceAmount(); //reducing inventory
            }
        }
    }

    @Override // the method that return written items
    public Item[] getItems() {
        return items;
    }

}
