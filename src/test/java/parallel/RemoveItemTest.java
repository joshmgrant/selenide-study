package parallel;

import org.junit.Test;

public class RemoveItemTest {

    private InventoryPage inventoryPage;

    @Test
    public void removeOneItem() {
        inventoryPage = new InventoryPage();
        inventoryPage.visit();
    }

    @Test
    public void removeTwoItems() {
        inventoryPage = new InventoryPage();
        inventoryPage.visit();
    }
}
