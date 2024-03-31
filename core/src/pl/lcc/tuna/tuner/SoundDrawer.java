/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lcc.tuna.tuner;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;

/**
 *
 * @author piko
 */
public class SoundDrawer {

    private final int height;
    private final int width;
    private Pixmap pixmap;
    
    
    public SoundDrawer(int width, int height){
        this.width = width;
        this.height = height;
        pixmap = new Pixmap(1,1,Pixmap.Format.Alpha);
    }
    
    public Pixmap drawFromSound(short[] sound){
        pixmap.dispose();
        pixmap = new Pixmap(width, height, Pixmap.Format.RGB565);
        int zero = height/2;
        pixmap.setColor(Color.YELLOW);
        for (int i =0; i<sound.length;i++){
            pixmap.drawPixel(i, sound[i]+zero);
        }
        
        return pixmap;
    }
    
    public void dispose (){
        pixmap.dispose();
                
    }
}
