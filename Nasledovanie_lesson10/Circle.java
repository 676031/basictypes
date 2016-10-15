package Nasledovanie_lesson10;

public class Circle extends Shape {
    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r, int border, String color) {
        super(border, color); 
        this.x = x;
        this.y = y;
        this.r = r; 
    }

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    

}
