package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//*[contains(@class,'welcome')]")
    WebElement txtWelcomeMessage;
    @FindBy(xpath = "//a[@id='TenantId']")
    WebElement btnTenantManagmentTab;
    @FindBy(xpath = "//ul[@id='side-menu']")
    WebElement sideMenu;
    public String getWelcomeMessage(){
       String message= txtWelcomeMessage.getText();
        return message;
    }
    public void clickOnBtnTenantManagmentTab(){
     btnTenantManagmentTab.click();
    }
    public List <WebElement>getMenuList(){
        List<WebElement>tabs=driver.findElements(By.xpath("//ul[@id='side-menu']//li//span[@class=\"nav-label\"]"));
        return tabs;
    }

}
