package TestNG1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeDemo {

    @Test(dataProvider = "loginInfo", dataProviderClass = DataProviderClass.class)
    public void testLogin(String username, String password){
        System.out.println("Username "+username);
        System.out.println("Password "+password);
        System.out.println("");
    }


}
