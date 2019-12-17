package parallel;

import org.junit.Assert;
import org.junit.Test;

public class RemoveItemTest {

    private InventoryPage inventoryPage;

    @Test
    public void removeOneItem() {
        inventoryPage = new InventoryPage();
        inventoryPage.visit();

        inventoryPage.addItems(2);
        inventoryPage.remoteItems(1);

        Assert.assertEquals(inventoryPage.getNumberOfItemsInCart(), "1");
    }

    @Test
    public void removeTwoItems() {
        inventoryPage = new InventoryPage();
        inventoryPage.visit();

        inventoryPage.addItems(2);
        inventoryPage.remoteItems(2);

        Assert.assertEquals(inventoryPage.getNumberOfItemsInCart(), "0");
    }
}
