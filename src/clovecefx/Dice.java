/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clovecefx;
import java.util.Random;

/**
 *
 * @author Pavel
 */
public class Dice {
    private int easyRoll = 6;
    private boolean threwSix = false;
    private Random generator;
    
    
    /**
     * 
     * @return return number of throwed dice
     */
    public int getEasyRoll() {
        return easyRoll;
    }
    
    public boolean getThrewSix(){
        return threwSix;
    }
    
    /**
     * @return random roll dice (1-6)
     */
    public int diceRoll() {
        generator = new Random();
        easyRoll = generator.nextInt(6) + 1;
        //easyRoll = generator.nextInt(3) + 4;
        if(easyRoll == 6){
            threwSix = true;
        }else{
            threwSix = false;
        }
        return easyRoll;
    }
}
