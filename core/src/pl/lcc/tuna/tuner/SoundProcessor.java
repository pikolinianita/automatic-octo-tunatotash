/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lcc.tuna.tuner;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.AudioRecorder;
import java.util.Arrays;

/**
 *
 * @author piko
 */
public class SoundProcessor {

    private AudioRecorder recorder;
    
    public SoundProcessor(){
         recorder = Gdx.audio.newAudioRecorder(44100, true);
    }
    
    public short[] getSound(){
        short[] sound = new short[100];
        recorder.read(sound, 0, 100);
      //  System.out.println(Arrays.toString(sound));
        return sound;
    }
    
    public void dispose(){
        recorder.dispose();
    }
    
    
}
