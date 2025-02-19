package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id=\"txtLogin\"]")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement submit;

    public void setEmail(String email){
        emailId.sendKeys(email);
    }
    public void setPassword(String pass){
          password.sendKeys(pass);
    }
    public void clickSubmit(){
        submit.click();
    }
}
