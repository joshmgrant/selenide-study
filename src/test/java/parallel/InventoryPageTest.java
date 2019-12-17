package parallel;

import org.junit.Test;

public class InventoryPageTest extends Page {

    private InventoryPage inventoryPage;

    @Test
    public void hasBackpack(){
        inventoryPage = new InventoryPage();
        inventoryPage.visit();
    }

    @Test
    public void logout(){
        inventoryPage = new InventoryPage();
        inventoryPage.visit();
    }
}
