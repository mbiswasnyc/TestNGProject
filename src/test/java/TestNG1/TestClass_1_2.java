package TestNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass_1_2 {
    @Test(priority = 2)
    public void test_1_4(){
        System.out.println("Test_1.4");
    }

    @Test(priority = 1, groups = "Smoke")
     public void test_1_5(){
        System.out.println("Test_1.5");
        Assert.assertEquals(addSum(2,6), 8,"Test failed");
        Assert.assertTrue(addSum(2,5)>6);
    }

    @Test(priority = 3)
    public void test_1_6(){
        System.out.println("Test_1.6");
    }

    public int addSum(int num1, int num2){
        return num1+num2;
    }
}
