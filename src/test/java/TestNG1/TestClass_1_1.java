package TestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_1_1 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
        System.out.println("");
    }
    @Test
    public void test_1_1(){
        System.out.println("Test_1.1");
    }

    @Test(groups = "Smoke")
    public void test_1_2(){
        System.out.println("Test_1.2");
    }

    @Test
    public void test_1_3(){
        System.out.println("Test_1.3");
    }
}
