/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clovecefx;

/**
 *
 * @author Pavel
 */
public class Figurine { 
    private String color = "";
    private int index;
    private boolean canGoHome = false;
    
    public String getColor(){
        return color;
    }
    
    public int getIndex(){
        return index;
    }
    
    public void setUp(String color, int index){
        this.color = color;
        this.index = index;
    }
    
    public void setCanGoHome(boolean xy){
        canGoHome = xy;
    }
    public boolean getCanGoHome(){
        return canGoHome;
    }
    
}
