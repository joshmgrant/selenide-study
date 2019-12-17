package parallel;

import org.junit.Test;
import org.junit.Assert;

public class AddItemsTest extends TestBase {

    private InventoryPage inventoryPage;

    @Test
    public void addOneItem() {
        inventoryPage = new InventoryPage();
        inventoryPage.visit();

        inventoryPage.addItems(1);

        Assert.assertEquals(inventoryPage.getNumberOfItemsInCart(), "1");

    }

    @Test
    public void addTwoItems() {
        inventoryPage = new InventoryPage();
        inventoryPage.visit();

        inventoryPage = new InventoryPage();
        inventoryPage.visit();

        inventoryPage.addItems(2);

        Assert.assertEquals(inventoryPage.getNumberOfItemsInCart(), "1");

    }
}
