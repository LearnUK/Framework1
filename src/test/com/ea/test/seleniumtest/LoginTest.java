package com.ea.test.seleniumtest;
import com.ea.framework.base.BrowserTypes;
import com.ea.framework.base.DriverContext;
import com.ea.framework.base.FrameworkInitialise;
import com.ea.framework.config.ConfigReader;
import com.ea.framework.config.Settings;
import com.ea.framework.utility.ExcelUtil;
import com.ea.framework.utility.LogUtil;
import com.ea.test.ppages.HomePage;
import com.ea.test.ppages.LoginPage;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.ea.framework.utility.ExcelUtil.ReadCell;

//public class LoginTest extends FrameworkInitialise {
public class LoginTest extends TestInitialize {
    //Global Variable
    //private WebDriver driver = null;

    @Test
    public void Login() throws InterruptedException {
        /*driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("Password");
        driver.findElement(By.name("Login")).click();*/

        //HomePage homePage = new HomePage();
        //HomePage homePage = GetInstance(HomePage.class);
        //CurrentPage = homePage.clickLogin();

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage = CurrentPage.As(HomePage.class).clickLogin();

        Thread.sleep(2000);
        //((LoginPage) CurrentPage).Login("admin","password");
        //CurrentPage.As(LoginPage.class).Login("admin","password");
        /*LoginPage page = new LoginPage();
        loginPage.Login("admin", "password");*/

        //DDT from Excel
        CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(("UserName"),1),ExcelUtil.ReadCell(("Password"),1));
        //CurrentPage.As(LoginPage.class).Login(ReadCell(0,1), ReadCell(1,1));
        //CurrentPage.As(LoginPage.class).Login(ReadCell(String.valueOf(0),1), ReadCell(String.valueOf(1),1));

        System.out.println("Test Executed Successfully");
        Thread.sleep(2000);
        DriverContext.Driver.close();
    }
}