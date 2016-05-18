package clovecefx;
import java.util.Random;

/**
 *
 * @author Pavel
 */
public class Dice {
    /**
     * easyRoll - aktuální hod (začíná se na 6)
     * threwSix - jestli byla hozena 6
     */
    private int easyRoll = 6;
    private boolean threwSix = false;
    private Random generator;
    
    
    /**
     * @return aktuální hozené číslo
     */
    public int getEasyRoll() {
        return easyRoll;
    }
    
    /**
     * @return jestli padla 6
     */
    public boolean getThrewSix(){
        return threwSix;
    }
    
    /**
     * @return generování náhodného čísla od 1 do 6
     */
    public int diceRoll() {
        generator = new Random();
        easyRoll = generator.nextInt(6) + 1;
        if(easyRoll == 6){
            threwSix = true;
        }else{
            threwSix = false;
        }
        return easyRoll;
    }
}
