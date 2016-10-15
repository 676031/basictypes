package Nasledovanie_lesson10;

public class Shape {
    private int border;
    private String color;

    public Shape(int border, String color) {
        this.border = border;
        this.color = color;
    }
   
     
    public void draw(){
}
    
    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
