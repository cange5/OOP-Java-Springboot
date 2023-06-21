package models;

public class Motorcycle extends Vehicle{

    private int speed;
    private int numberOfTires;

    public Motorcycle(int speed){
        super.speed=speed;
        this.numberOfTires=2;
    }
    @Override
    public int getNumbersOfTires() {
        return this.numberOfTires;
    }
}
