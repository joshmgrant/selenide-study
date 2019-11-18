package parallel;

import org.junit.Test;

public class AddItemsTest extends TestBase {

    private InventoryPage inventoryPage;

    @Test
    public void addOneItem() {
        inventoryPage = new InventoryPage();
        inventoryPage.visit();


    }

    @Test
    public void addTwoItems() {
        inventoryPage = new InventoryPage();
        inventoryPage.visit();

    }
}
