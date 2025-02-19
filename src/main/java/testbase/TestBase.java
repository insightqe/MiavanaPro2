package testbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.LoginPage;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

  public WebDriver driver;
  public Properties properties;
    @BeforeClass
   // @Parameters({"os","browser"})
//    public void setUp(String os,String br) throws IOException {
    public void setUp() throws IOException {
        //Loading Config File
        FileReader fileReader=new FileReader("src/main/resources/config.properties");
        properties=new Properties();
        properties.load(fileReader);


//        switch(br.toLowerCase()){
//            case "chrome":driver=new ChromeDriver();break;
//            case "edge":driver=new EdgeDriver();break;
//            case "firefox":driver=new FirefoxDriver();break;
//            default:
//                System.out.println("Invalid Browser name");
//            return;
//        }
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sarala padmaperuma\\IdeaProjects\\MiavanaPro2\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(properties.getProperty("appURL"));
        driver.manage().window().maximize();
    }
    public void loginToHomePage(){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.setEmail(properties.getProperty("emailsuperadmin"));
        loginPage.setPassword(properties.getProperty("passwordsuperadmin"));
        loginPage.clickSubmit();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
