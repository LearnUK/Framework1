package com.ea.framework.config;

import com.ea.framework.base.BrowserTypes;
import com.ea.framework.utility.LogUtil;

import java.sql.Connection;

public class Settings {
    public static Connection AUTConnection;
    public static String AUTConnectionString;

    /*    AUTConnectionString = asda
                ReportingConnectionString = asdf
        LogPath = C:/Softwares/Framework/Framework1/Logs
                ExcelSheetPath = C:/Softwares/Framework/Framework1/data.xls
                DriverType = com.microsoft.sqlserver.jdbc.SQLServerDriver
                */
    public static String ReportingConnectionString;
    public static String LogPath;
    public static String ExcelSheetPath;
    public static String DriverType;
    public static String AUT;
    public static BrowserTypes BrowserType;
    public static LogUtil Logs;
}
