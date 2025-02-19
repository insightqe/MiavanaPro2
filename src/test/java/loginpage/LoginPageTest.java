package loginpage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;



public class LoginPageTest extends TestBase {

    @Test
    public void validateAvailabilityOfTenantManagementTab(){
        loginToHomePage();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals("Welcome to MyAvana Admin.",homePage.getWelcomeMessage());

    }

}
