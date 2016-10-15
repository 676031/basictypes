package Box;


public interface Movable {
    int defaultXPos =0;
    int defaultYPos =0;
    
    static void staticMethod(){
        
    }
    
    void moveLeft(int xoffset);
    void moveRight(int xoffset);
    void moveUp(int yoffset);
    void moveDown(int yoffset);

    /**
     *
     */
    default void defaultMethod(){
        System.out.println("defaultMethod");
    }

}
