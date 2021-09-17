public interface VendingMachineImplementation {
    public void displayInventory();
    public void dispenseItem(int itemCode);
    Item[] getItems();
    }
