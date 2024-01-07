package com.ea.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FrameworkInitialise extends Base
{
    public void InitializeBrowser(BrowserTypes browserTypes)
    {
        WebDriver driver = null;
        switch (browserTypes)
        {
            case Chrome:
            {
                System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Java\\chromedriver_win32\\chromedriver1.exe");
                //DriverContext.Driver = new ChromeDriver();
                driver = new ChromeDriver();
                //DriverContext.setDriver(driver);
                break;
            }
            case IE:
            {
                /*DriverContext.Driver = new InternetExplorerDriver();
                System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Java\\chromedriver_win32\\chromedriver1.exe");*/
                //DriverContext.Driver = new ChromeDriver();
                driver = new InternetExplorerDriver();
                //DriverContext.setDriver(driver);
                break;
            }
        }
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);
    }
}
