/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Rafidimalala
 */
public class Flute implements IInstrument{
    private final String sound = "fluflu";
    private final int volume = 3;
    private final String color = "gray";
    @Override
    public String play(){
        return sound;
    }
    
    @Override
    public int getSoundVolume(){
        return volume;
    }
    
    @Override
    public String getColor(){
        return color;
    }      
}
