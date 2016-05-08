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
public class Game {
    
    private boolean endGame = false;
    private int player = 1;
    private int numberOfPlayers = 4;
    private String namePlayer;
    
    public void setNumberOfPlayert(int num){
        numberOfPlayers = num;
    }
    
    public String actualPlayer(){
        if(numberOfPlayers == 2){
            while(endGame == false){
                if(player == 1){
                    player = 2;
                    namePlayer = "red";
                    return "red";
                }else if(player == 2){
                    player = 1;
                    namePlayer = "blue";
                    return "blue";
                }else{
                    return "FAILED COLOR";
                }
            }
        }else if(numberOfPlayers == 3){
            while(endGame == false){
                if(player == 1){
                    player = 2;
                    namePlayer = "red";
                    return "red";
                }else if(player == 2){
                    player = 3;
                    namePlayer = "blue";
                    return "blue";
                }else if(player == 3){
                    player = 1;
                    namePlayer = "yellow";
                    return "yellow";
                }else{
                    return "FAILED COLOR";
                }
            }
        }else if(numberOfPlayers == 4){
            while(endGame == false){
                if(player == 1){
                    player = 2;
                    namePlayer = "red";
                    return "red";
                }else if(player == 2){
                    player = 3;
                    namePlayer = "blue";
                    return "blue";
                }else if(player == 3){
                    player = 4;
                    namePlayer = "yellow";
                    return "yellow";
                }else if(player == 4){
                    player = 1;
                    namePlayer = "green";
                    return "green";
                }else{
                    return "FAILED COLOR";
                }
            }
        }
        return "FAILED numberOfPlayers";
    }
    
    public String getNamePlayer(){
        return namePlayer;
    }
    
    public void resetNamePlayer(){
        namePlayer = "red";
        player = 2;
    }
    
    
    /*private void testForThreeTimesThrow(int from, int to, Field field, String player){
        boolean fail = false;
        Dice dice = new Dice();
        for(int i = from; i<=to; i++){
            if(field.getStart(i)==null){
                fail = true;
            }
        }
        if(fail != true){
            for(int i = 0; i<3; i++){
                System.out.println("Roll is: "+dice.diceRoll());
                if(dice.getEasyRoll() == 6){
                    System.out.println(player+" can set up figure");
                    field.placeFigureOnCycle(player);
                    break;
                }
            }
        }else{
            System.out.println("You can move figure on cycle");
        }
        this.actualPlayer();
    }
    
    public void throwThreeTimesOnStart(String actPlayer, Field field){
        switch (actPlayer) {
                case "red":
                    testForThreeTimesThrow(0, 3, field, actPlayer);
                    break;
                case "blue":
                    testForThreeTimesThrow(4, 7, field, actPlayer);
                    break;
                case "yellow":
                    testForThreeTimesThrow(8, 11, field, actPlayer);
                    break;
                case "green":
                    testForThreeTimesThrow(12, 15, field, actPlayer);
                    break;
                default:
                    System.err.println("FAIL in Game.throwThreeTimesOnStart()");
                break;
                }
    }*/
}
