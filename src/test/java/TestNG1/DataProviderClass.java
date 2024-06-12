package TestNG1;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "loginInfo")
    public static Object[][] createLoginInfo(){
        Object[][] logInfos = new Object[4][2];
        logInfos[0][0] = "Admin";
        logInfos[0][1] = "admin123";

        logInfos[1][0] = "Admin";
        logInfos[1][1] = "admin12";

        logInfos[2][0] = "Admindf";
        logInfos[2][1] = "admin123";

        logInfos[3][0] = "Adminre";
        logInfos[3][1] = "admin1234";
        return logInfos;
    }
}
