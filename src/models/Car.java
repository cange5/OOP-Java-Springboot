package models;

public class Car {
    private String model;
    protected String manufacture;
    public int year;

    public Car(String model, String manufacture, int year){
        this.model=model;
        this.manufacture=manufacture;
        this.year=year;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
