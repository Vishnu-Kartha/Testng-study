package tests;

import com.aventstack.extentreports.Status;
import lib.TestBase;
import org.testng.annotations.Test;

public class InventoryTests extends TestBase {
    @Test
    public void inventorytest1(){
        super.log(Status.INFO, "Launching Browser: "+ super.browser);
        System.out.println("Inventory Tests1");
    }
    @Test
    public void inventorytest2(){
        super.log(Status.INFO, "Launching Browser: "+ super.browser);
        System.out.println("Inventory Tests2");
    }
    @Test
    public void inventorytest3(){
        super.log(Status.INFO, "Launching Browser: "+ super.browser);
        System.out.println("Inventory Tests3");
    }
}
