/*

 */
package ch.heigvd.res.io;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

/**
 *
 * @author marco
 */
public class WriteCSV {
    
    public static void writeFile(String path, Stats statTmp){
        
        try{
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file,true);
        
        /* fileWrite.write(statTmp.GetString() + "\n");
        
            fileWrite.write("Time;");
            for(String strTmp : statTmp.getTimeList()){
                fileWrite.write(strTmp + ";");  // écrire une ligne dans le fichier resultat.txt
            }
                fileWrite.write("\n Block size;");
        
            for(String strTmp : statTmp.getBlockList()){
                fileWrite.write(strTmp + ";");  // écrire une ligne dans le fichier resultat.txt
            }
            fileWrite.write("\n");*/
       
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
