//all needed functionality to start our app
public interface VendingMachineImplementation {
    public void displayInventory();

    public void dispenseItem(int itemCode);

    Item[] getItems();
}
