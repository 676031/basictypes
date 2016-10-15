/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork;

/**
 *
 * @author Администратор
 */
public class Car {

    public Car(double engineVolume, String render, String colour, int seets) {
        this.engineVolume = engineVolume;
        this.render = render;
        this.colour = colour;
        this.seets = seets;
    }
    private double engineVolume;
    private String render;
    private String colour;
    private int seets;

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSeets() {
        return seets;
    }

    public void setSeets(int seets) {
        this.seets = seets;
    }
}
