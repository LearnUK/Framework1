package com.ea.framework.utility;

import com.ea.framework.config.Settings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {
    //File  format for log name
    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
    String fileNameFormat = date.format(formatter);
    private BufferedWriter bufferedWriter = null;

    //Create log file
        public void CreateFile() throws IOException {
            try{
                //File dir = new File("C:\\Softwares\\Framework\\Framework1\\Logs");
                File dir = new File(Settings.LogPath);
                if(!dir.exists())
                    dir.mkdir();
                //Create Log File
                File logFile = new File(dir+"/"+fileNameFormat+".log");

                FileWriter fileWriter =new FileWriter(logFile.getAbsoluteFile());
                bufferedWriter =new BufferedWriter(fileWriter);
            }
            catch (Exception e)
                {
                }
        }
    //Write message within log file
    public void Write(String message)
    {
        try{
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy:HH MM SS");
            String dateFormat = date.format(formatter);
            bufferedWriter.write("["+dateFormat+"]" +message);
            bufferedWriter.newLine();
            //bufferedWriter.close();
            bufferedWriter.flush();
        }catch (Exception e){

        }
    }
}
