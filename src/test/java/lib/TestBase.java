package lib;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.*;
@Listeners(ExtentITestListenerClassAdapter.class)
public class TestBase {
    protected String browser;
    @BeforeSuite
    protected void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    protected void afterSuite(){
        System.out.println("After Suite");
    }
    @BeforeTest
    protected void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    protected void afterTest(){
        System.out.println("After Test");
    }
    @BeforeClass
    @Parameters("browser")
    protected void beforeClass(String browser){
        this.browser = browser;
        System.out.println("Launching browser : "+ browser);
        System.out.println("Before Class");
    }
    @AfterClass
    protected void afterClass(){
        System.out.println("After Class");
    }
    @BeforeMethod
    protected void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    protected void afterMethod(){
        System.out.println("After Method");
    }
    protected void log(Status status, String msg){
        ExtentTestManager.getTest().log(status, msg);
    }

}
