package lib;

import org.testng.annotations.*;

public class TestBase {
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

}
