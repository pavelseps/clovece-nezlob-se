package clovecefx;

/**
 *
 * @author Pavel
 */
public class Figurine { 
    /**
     * color - obsahuje barvu figurky
     * index - rozlišuje figurky se stejnou barvou (1-4)
     * canGoHome - zapsuje se, jestli figurka přešla půlku hlavního cyklu
     */
    private String color = "";
    private int index;
    private boolean canGoHome = false;
    
    /**
     * @return barvu figurky
     */
    public String getColor(){
        return color;
    }
    
    /**
     * @return index figurky
     */
    public int getIndex(){
        return index;
    }
    
    /**
     * Vytvoření figurky
     * nastavení barvy a indexu
     * 
     * @param color
     * @param index 
     */
    public void setUp(String color, int index){
        this.color = color;
        this.index = index;
    }
    
    /**
     * změna canGoHome
     * @param xy 
     */
    public void setCanGoHome(boolean xy){
        canGoHome = xy;
    }
    
    /**
     * @return jestli figurka přešla půlku hlavního cyklu
     */
    public boolean getCanGoHome(){
        return canGoHome;
    }
    
}
