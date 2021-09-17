import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class VendingMachineTest {

    private Item[] items;

    @Test
    public void testCreateItemsArray() {
        items = new Item[0];
        assertEquals(0, items.length);
    }

    @Test
    public void testAddItem() {
        items = new Item[1];
        items[0] = new Item("Item",1,1.0);
        assertEquals(1, items.length);
    }
}
