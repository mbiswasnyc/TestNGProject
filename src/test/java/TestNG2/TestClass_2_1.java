package TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestClass_2_1 {
    @Test(groups = "Smoke")
    public void test_2_1(){
        System.out.println("Test_2.1");
    }

    @Test
    public void test_2_2(){
        System.out.println("Test_2.2");
        Assert.assertEquals(addSum(2,6), 8,"Test failed");
        Assert.assertTrue(addSum(2,5)>6);
    }

    @Test(groups = "Smoke")
    public void test_2_3(){
        System.out.println("Test_2.3");
    }

    public int addSum(int num1, int num2){
        return num1+num2;
    }
}
