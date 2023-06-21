package models;

public abstract class Vehicle {
    protected int speed;

    public int getSpeed(){
        return this.speed;
    }

    public abstract int getNumbersOfTires();

}
