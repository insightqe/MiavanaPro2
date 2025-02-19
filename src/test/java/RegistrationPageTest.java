import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import testbase.TestBase;

public class RegistrationPageTest extends TestBase {
    WebDriver driver;
    LoginPage loginPage;
    @Test
    public void validateRegistrationPage(){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.setEmail("email@gmail.com");
        loginPage.setPassword("1234");
        loginPage.clickSubmit();
        String currentTitle=driver.getTitle();
        Assert.assertEquals(currentTitle,"Page name");

    }

}
