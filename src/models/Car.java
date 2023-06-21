package models;

public class Car extends Vehicle{

    private int speed;
    private int numberOfTires;

    public Car(int speed){
        super.speed=speed;
        this.numberOfTires=4;
    }

    @Override
    public int getNumbersOfTires() {
        return this.numberOfTires;
    }
}
