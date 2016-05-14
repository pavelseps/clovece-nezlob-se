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
public class Field {
    /**
     * 0-39 cylcle this
     * 
     * 0-3 - red
     * 4-7 - blue
     * 8-11 - yellow
     * 12-15 - green
     */
    private Figurine[] start = new Figurine[16];
    private int[][] defaultPositionS = {
        {135 ,576},
        {576, 135},
        {134, 135},
        {576, 577}
    };
    private int[][] positionSXY = {
        {defaultPositionS[0][0], defaultPositionS[0][1]}, //red
        {defaultPositionS[0][0]+62, defaultPositionS[0][1]},
        {defaultPositionS[0][0], defaultPositionS[0][1]+62},
        {defaultPositionS[0][0]+62, defaultPositionS[0][1]+62},
        {defaultPositionS[1][0], defaultPositionS[1][1]}, //blue
        {defaultPositionS[1][0]+62, defaultPositionS[1][1]},
        {defaultPositionS[1][0], defaultPositionS[1][1]+62},
        {defaultPositionS[1][0]+62, defaultPositionS[1][1]+62},
        {defaultPositionS[2][0], defaultPositionS[2][1]}, //yellow
        {defaultPositionS[2][0]+62, defaultPositionS[2][1]},
        {defaultPositionS[2][0], defaultPositionS[2][1]+62},
        {defaultPositionS[2][0]+62, defaultPositionS[2][1]+62},
        {defaultPositionS[3][0], defaultPositionS[3][1]}, //green
        {defaultPositionS[3][0]+62, defaultPositionS[3][1]},
        {defaultPositionS[3][0], defaultPositionS[3][1]+62},
        {defaultPositionS[3][0]+62, defaultPositionS[3][1]+62}
    };
    
    private Figurine[] position = new Figurine[40];
    private int[][] defaultPositionXY = {
        {327, 93}
    };
    private int[][] positionXY = {
        {defaultPositionXY[0][0], defaultPositionXY[0][1]},
        {defaultPositionXY[0][0]+59, defaultPositionXY[0][1]},
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]}, //Down
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+59},  
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+118},
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+177},
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+236}, 
        {defaultPositionXY[0][0]+177, defaultPositionXY[0][1]+236}, //Right
        {defaultPositionXY[0][0]+236, defaultPositionXY[0][1]+236},
        {defaultPositionXY[0][0]+295, defaultPositionXY[0][1]+236},
        {defaultPositionXY[0][0]+354, defaultPositionXY[0][1]+236},
        {defaultPositionXY[0][0]+354, defaultPositionXY[0][1]+295}, //Down
        {defaultPositionXY[0][0]+354, defaultPositionXY[0][1]+354},
        {defaultPositionXY[0][0]+295, defaultPositionXY[0][1]+354}, //Left
        {defaultPositionXY[0][0]+236, defaultPositionXY[0][1]+354},
        {defaultPositionXY[0][0]+177, defaultPositionXY[0][1]+354},
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+354}, //Down
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+413},
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+472},
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+533},
        {defaultPositionXY[0][0]+118, defaultPositionXY[0][1]+592}, //Left
        {defaultPositionXY[0][0]+59, defaultPositionXY[0][1]+592},
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+592}, //Up
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+533},
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+472},
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+413},
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+354}, //Left
        {defaultPositionXY[0][0]-59, defaultPositionXY[0][1]+354},
        {defaultPositionXY[0][0]-118, defaultPositionXY[0][1]+354},
        {defaultPositionXY[0][0]-177, defaultPositionXY[0][1]+354},
        {defaultPositionXY[0][0]-236, defaultPositionXY[0][1]+354},  //Top
        {defaultPositionXY[0][0]-236, defaultPositionXY[0][1]+295},
        {defaultPositionXY[0][0]-236, defaultPositionXY[0][1]+236},  //Right
        {defaultPositionXY[0][0]-177, defaultPositionXY[0][1]+236},
        {defaultPositionXY[0][0]-118, defaultPositionXY[0][1]+236},
        {defaultPositionXY[0][0]-59, defaultPositionXY[0][1]+236}, //Up
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+236},
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+177},
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+118},
        {defaultPositionXY[0][0], defaultPositionXY[0][1]+59}  //End cycle
    };
    
    private Figurine[] positionH = new Figurine[16];
    private int[][] defaultPositionHXY = {
        {386 ,622},
        {386, 152},
        {151, 387},
        {621, 387}
    };
    private int[][] positionHXY = {
        {defaultPositionHXY[0][0], defaultPositionHXY[0][1]},
        {defaultPositionHXY[0][0], defaultPositionHXY[0][1]-59},
        {defaultPositionHXY[0][0], defaultPositionHXY[0][1]-118},
        {defaultPositionHXY[0][0], defaultPositionHXY[0][1]-177},
        {defaultPositionHXY[1][0], defaultPositionHXY[1][1]},
        {defaultPositionHXY[1][0], defaultPositionHXY[1][1]+59},
        {defaultPositionHXY[1][0], defaultPositionHXY[1][1]+118},
        {defaultPositionHXY[1][0], defaultPositionHXY[1][1]+177},
        {defaultPositionHXY[2][0], defaultPositionHXY[2][1]},
        {defaultPositionHXY[2][0]+59, defaultPositionHXY[2][1]},
        {defaultPositionHXY[2][0]+118, defaultPositionHXY[2][1]},
        {defaultPositionHXY[2][0]+177, defaultPositionHXY[2][1]},
        {defaultPositionHXY[3][0], defaultPositionHXY[3][1]},
        {defaultPositionHXY[3][0]-59, defaultPositionHXY[3][1]},
        {defaultPositionHXY[3][0]-118, defaultPositionHXY[3][1]},
        {defaultPositionHXY[3][0]-177, defaultPositionHXY[3][1]},
    };
    
    public boolean checkHome(int from, int to){
        for (int i = from; i <= to; i++) {
            if(positionH[i] == null){
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
    
    public boolean goHome(int from, int to){
        if(positionH[to] == null){
            positionH[to] = position[from];
            position[from] = null;  
            return true;
        }else{
            return false;
        }
    }
    
    public int getPositionHX(int pos){
        return positionHXY[pos][0];
    }
    
    public int getPositionHY(int pos){
        return positionHXY[pos][1];
    }
    
    public int findFigurine(String color, int index){
        for(int i = 0; i< this.position.length; i++){
            if(this.position[i] != null){
                if(this.position[i].getColor().equals(color) && this.position[i].getIndex() == index){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public int isFigurineOnStart(String color, int index){
        for(int i = 0; i< this.start.length; i++){
            if(this.start[i] != null){
                if(this.start[i].getColor().equals(color) && this.start[i].getIndex() == index){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public boolean isColorOnCycle(String actPlaer){
        for(int i = 0; i< this.position.length; i++){
            if(this.position[i] != null){
                if(this.position[i].getColor().equals(actPlaer)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public int getPositionX(int pos){
        return positionXY[pos][0];
    }
    
    public int getPositionY(int pos){
        return positionXY[pos][1];
    }
    
    public int getPositionSX(int pos){
        return positionSXY[pos][0];
    }
    
    public int getPositionSY(int pos){
        return positionSXY[pos][1];
    }
    
    public Figurine getPosition(int pos){
        return position[pos];
    }
    
    public void nullPositionForResetGame(){
        for(int i = 0; i<position.length; i++){
            position[i] = null;
        }

        for(int i = 0; i<positionH.length; i++){
            positionH[i] = null;
        }
    }
    
    public void setPosition(int pos, Figurine fig){
        position[pos] = fig;
    }
    
    public Figurine getStart(int pos){
        return start[pos];
    }
    
    public Figurine[] getStartField(){
        return start;
    }
    
    public void setStart(int pos, Figurine fig){
        start[pos] = fig;
    }
    
    public void nullStart(int pos){
        start[pos] = null;
    }
    
    public void formStarToStartField(int from, int to){
        position[to] = start[from];
        start[from] = null;
    }
    
    public boolean testForPlaceFigure(int startField){
        return position[startField] == null;
    }
    
    public void getStartField(int from, int to){
        for(int i = from; i <= to;i++){
            System.out.println(start[i]);
        }
    }
    
    public boolean checkStart(int from, int to){
        for (int i = from; i <= to; i++) {
            if(start[i] == null){
                return false;
            }
        }
        return true;
    }
    
    public void goStart(int from, int to){
        start[to] = position[from];
        position[from] = null;
    }
    
    public void giveMeAllCycle(){
        System.out.println("Start:");
        for(int i = 0; i<start.length; i++){
            if(start[i] != null){
                System.out.println(i+":\t"+start[i].getColor()+start[i].getIndex());
            }
        }
        System.out.println("Cycle:");
        for(int i = 0; i<position.length; i++){
            if(position[i] != null){
                System.out.println(i+":\t"+position[i].getColor()+position[i].getIndex());
            }
        }
        System.out.println("Home:");
        for(int i = 0; i<positionH.length; i++){
            if(positionH[i] != null){
                System.out.println(i+":\t"+positionH[i].getColor()+positionH[i].getIndex());
            }
        }
    }
    
    private void moveOnCycle(int oldPos, int goTo){
        position[goTo] = position[oldPos];
        position[oldPos] = null; 
    }   
    
    public int changePosition(int oldPos, int goTo, String actPlayer){
        if(position[goTo] == null){
            this.moveOnCycle(oldPos, goTo);
        }else{
            if(!position[goTo].getColor().equals(actPlayer)){
            switch (position[goTo].getColor()) {
                case "red":
                    for(int i = 0; i < 4; i++){
                        if(start[i] == null){
                            this.goStart(goTo, i);
                            this.moveOnCycle(oldPos, goTo);
                            return 1;
                        }
                    } 
                    break;
                case "blue":
                    for(int i = 4; i<8; i++){
                        if(start[i] == null){
                            this.goStart(goTo, i);
                            this.moveOnCycle(oldPos, goTo);
                            return 1;
                        }
                    }   
                    break;
                case "yellow":
                    for(int i = 8; i<12; i++){
                        if(start[i] == null){
                            this.goStart(goTo, i);
                            this.moveOnCycle(oldPos, goTo);
                            return 1;
                        }
                    }  
                    break;
                case "green":
                    for(int i = 12; i<16; i++){
                        if(start[i] == null){
                            this.goStart(goTo, i);
                            this.moveOnCycle(oldPos, goTo);
                            return 1;
                        }
                    }   
                    break;
                default:
                    System.err.println("FAIL in Field.changePosition()");
                break;
                }
            }else{
                return -1;
            }
        }
        return 0;
    }

    Object sleep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
