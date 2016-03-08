/*
 *-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 * File      : WriteCSV.java
 * Author(s) : Marco Monzione
 * Date      : 07.03.2016
 *-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 */
package ch.heigvd.res.io;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class WriteCSV {
    
    public static void writeCSV(String path, Stats statTmp){
        
        try{
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file,true);

            List<String> timeListTmp  = statTmp.getTimeList();
            List<String> blockListTmp = statTmp.getBlockList();
       
            fileWrite.write(statTmp.GetString() + "\n");
            fileWrite.write("Time;Block size\n");
            for(int i = 0; i < timeListTmp.size(); i++){
               fileWrite.write(timeListTmp.get(i) + ";" + blockListTmp.get(i));
               fileWrite.write("\n");
            }
            fileWrite.write("\n");
            fileWrite.close();
        }
        catch(Exception e){
        }
    }
    
}
