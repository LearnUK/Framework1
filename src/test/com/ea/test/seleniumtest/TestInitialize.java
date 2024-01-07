package com.ea.test.seleniumtest;

import com.ea.framework.base.DriverContext;
import com.ea.framework.base.FrameworkInitialise;
import com.ea.framework.config.ConfigReader;
import com.ea.framework.config.Settings;
import com.ea.framework.utility.ExcelUtil;
import com.ea.framework.utility.LogUtil;
import com.ea.framework.utility.ReportingUtil;
import io.cucumber.java.Before;

import java.io.IOException;

public class TestInitialize extends FrameworkInitialise {
    @Before
    public void Initialize() throws IOException {
        //Initialize Config
        ConfigReader.PopulateSettings();

        //Logging
        //LogUtil logutil =new LogUtil();
        Settings.Logs =new LogUtil();
        Settings.Logs.CreateFile();;
        Settings.Logs.Write("Framework Initialise");

        //Create Test Cycle for Reporting
        /*Settings.ReportingConnectionString = DatabaseUtil.Open(Settings.ReportingConnectionString);
        ReportingUtil.CreateTestCycle(Settings.ReportingConnectionString);*/

        //Open the browser
        /*System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Java\\chromedriver_win32\\chromedriver1.exe");
        DriverContext.Driver = new ChromeDriver();*/

        Settings.Logs.Write("Test Cycle Created");
        //InitializeBrowser(BrowserTypes.Chrome);
        InitializeBrowser(Settings.BrowserType);
        Settings.Logs.Write("Browser Initialise");
        //DriverContext.Browser.GoToURL("http://eaapp.somee.com/");
        DriverContext.Browser.GoToURL(Settings.AUT);
        Settings.Logs.Write("Navigated to URL "+ Settings.AUT);
        //DriverContext.Driver.get("http://eaapp.somee.com/");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        try {
            //ExcelUtil util = new ExcelUtil("C:\\Softwares\\Framework\\Framework1\\data.xls");
            ExcelUtil util = new ExcelUtil(Settings.ExcelSheetPath);
        } catch (Exception e) {

        }
    }
}
