package com.ea.framework.config;

import com.ea.framework.base.BrowserTypes;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    private void ReadProperty() throws IOException {
        Properties p = new Properties();
        //Load the Property file available in same Package
        p.load((getClass().getResourceAsStream("GlobalConfig.properties")));
        Settings.AUTConnectionString = p.getProperty("AUTConnectionString");
        Settings.ReportingConnectionString = p.getProperty("ReportingConnectionString");
        Settings.LogPath = p.getProperty("LogPath");
        Settings.DriverType = p.getProperty("DriverType");
        Settings.ExcelSheetPath = p.getProperty("ExcelSheetPath");
        Settings.AUT = p.getProperty("AUT");
        Settings.BrowserType = BrowserTypes.valueOf(p.getProperty("BrowserType"));
    }
}
