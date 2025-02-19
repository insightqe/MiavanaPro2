package homepage.superadmin;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import testbase.TestBase;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * Scenario:Verify User have the access to tenants
 * Given
 * User logged in Myavana Application
 * And
 * User is in Home Page
 * When
 * User checks super admin menu
 * Then
 * Tenant management tab should be available and clickable
 * */

public class VerifySuperAdminAccessTenants extends TestBase {

    @Test
    public void validateWelcomeMessage(){
        loginToHomePage();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals("Welcome to MyAvana Admin.",homePage.getWelcomeMessage());
    }

    @Test
    public void validateTenantManagementTab(){
        loginToHomePage();
        HomePage homePage=new HomePage(driver);
        List<String> expectedMenuNames = Arrays.asList(
                "Users Management",
                "Tenants Management",
                "Products",
                "Brand",
                "Digital Assessment") ;
        for (int i=0;i<homePage.getMenuList().size();i++){
            Assert.assertEquals(expectedMenuNames.get(i),homePage.getMenuList().get(i).getText());
        }
    }

    @Test
    public void validateUserNavigatesToTenantManagementTab(){
        loginToHomePage();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnBtnTenantManagmentTab();
        }
    }

