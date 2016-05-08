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
    private int rollResult = 0;
    private int easyRoll = 6;
    private Random generator;
    
    
    /**
     * 
     * @return return number of throwed dice
     */
    public int getRollResult() {
        return rollResult;
    }
    
    public int getEasyRoll() {
        return easyRoll;
    }
    
    /**
     * @return random roll dice (1-6)
     */
    public int diceRoll() {
        generator = new Random();
        easyRoll = generator.nextInt(6) + 1;
        return easyRoll;
    }
    
    boolean moreThanSix = false;
    public int diceRollSixAgaint(){
        int roll = diceRoll();
        if(roll == 6){
            moreThanSix = true;
            rollResult = roll + rollResult;
            diceRollSixAgaint();        //řekni aby hodil znova a tím se tady zavolá znova tady ta funkce, teď to jede automaticky
            return rollResult;   
        }else{
            if(moreThanSix == false){
                rollResult = roll;
            }else{
                rollResult = roll + rollResult;
            }
            return rollResult;   
        }
    }
}
