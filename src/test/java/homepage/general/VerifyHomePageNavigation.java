package homepage.general;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import testbase.TestBase;

/**
 * Scenario:Verify User navigates to Home page successfully
 * Given
 * User is in login page
 * When
 * User input email, password
 * And
 * User clicks on the submit button
 * Then
 * User should navigate to the home page successfully
 * */

public class VerifyHomePageNavigation extends TestBase {
    @Test
    public void validateWelcomeMessage(){
        loginToHomePage();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals("Welcome to MyAvana Admin.",homePage.getWelcomeMessage());
    }
}
