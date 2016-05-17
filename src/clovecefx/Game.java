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
    
    /**
     * moveWithFigurine - jesltli se hází kostkou a nebo jestli se pohybuje s figurkou
     * player - index aktuálního hráče
     * numberOfPlayers - počet hráčů
     * namePlayer - jmeno hráče
     */
    private boolean moveWithFigurine = false;
    private int player = 1;
    private int numberOfPlayers = 4;
    private String namePlayer;
    
    /**
     * Pro změnení, jestli se táhne s figurkou nebo hází kostkou
     * @param bool 
     */
    public void setMoveWithFigurine(boolean bool){
        moveWithFigurine = bool;
    }
    
    /**
     * @return jestli se táhne s figurkou nebo hází kostkou
     */
    public boolean getMoveWithFigurine(){
        return moveWithFigurine;
    }
    
    /**
     * Nastavení počtu hráčů
     * @param num 
     */
    public void setNumberOfPlayert(int num){
        numberOfPlayers = num;
    }
    
    /**
     * vypisování hručů pro 2-4
     * nastaví se další hráč
     * @return aktuální hráč
     */
    public String actualPlayer(){
        if(numberOfPlayers == 2){
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
        }else if(numberOfPlayers == 3){
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
        }else if(numberOfPlayers == 4){
            if(player == 1){
                    player = 2;
                    namePlayer = "red";
                    return "red";
                }else if(player == 2){
                    player = 3;
                    namePlayer = "yellow";
                    return "yellow";
                }else if(player == 3){
                    player = 4;
                    namePlayer = "blue";
                    return "blue";
                }else if(player == 4){
                    player = 1;
                    namePlayer = "green";
                    return "green";
                }else{
                    return "FAILED COLOR";
                }
        }
        return "FAILED numberOfPlayers";
    }
    
    /**
     * @return jmeno aktuálního hráče (hodí se pro použití v kodu)
     */
    public String getNamePlayer(){
        return namePlayer;
    }
    
    /**
     * @return jnemo aktuálního hráče v češtině (hodí se pro vypsání na frontend)
     */
    public String getNiceNamePlayer(){
        switch (namePlayer) {
            case "red":
                return "červený"; 
            case "blue":
                return "modrý";   
            case "yellow":
                return "žlutý"; 
            case "green":
                return "zelený";
            default:
                return "Chyba u hráče";
        }
    }
    
    /**
     * Nastaví se červený hráč jako aktuální (vždy začíná červený)
     */
    public void resetNamePlayer(){
        namePlayer = "red";
        player = 2;
    }
}
