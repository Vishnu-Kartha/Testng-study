package tests;

import com.aventstack.extentreports.Status;
import lib.TestBase;
import org.testng.annotations.Test;

public class PurchaseTests extends TestBase {

    @Test
    public void purchase1(){
        super.log(Status.INFO, "Launching Browser: "+ super.browser);
        System.out.println("Purchase1");
    }
    @Test
    public void purchase2(){
        super.log(Status.INFO, "Launching Browser: "+ super.browser);
        System.out.println("Purchase2");
    }
    @Test
    public void purchase3(){
        super.log(Status.INFO, "Launching Browser: "+ super.browser);
        System.out.println("Purchase3");
    }
}
