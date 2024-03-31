/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lcc.tuna.tuner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author piko
 */
public class SoundSaver {

    private final String fileName;
    
    public SoundSaver(String fileName){
        this.fileName = fileName;
    }
    
    public void save(short[] sound) {
        try (java.io.FileWriter file = new FileWriter(fileName, true)) {
            file.append(Arrays.toString(sound));
            file.append(System.lineSeparator());
        } catch (IOException ex){
            System.out.println("oops from File save");
        }
        
    }
    
}
