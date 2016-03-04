/*
 */
package ch.heigvd.res.io;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Stats {

    private final String name;
    private final List<Long> timeList = new ArrayList<>();
    private final List<Integer> sizeBlockList = new ArrayList<>();

    public Stats(String name){
       this.name = name;
    }

    public void addTime (long value){
        timeList.add(value);
    }

    public void addSizeBlock(int value){
       sizeBlockList.add(value);
    }
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    //
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    public List<String> getTimeList(){

        List<String> timeListString = new ArrayList<>();
        for(Long longTmp : timeList){
            timeListString.add(longTmp.toString());
        }

        return timeListString;
    }
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    //
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    public List<String> getBlockList(){

        List<String> blockListString = new ArrayList<>();
        for(Integer intTmp : sizeBlockList){
            blockListString.add(intTmp.toString());
        }

        return blockListString;
    }
    
    public String GetString(){
        return this.name;
    }
}
