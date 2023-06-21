import models.Car;
import models.Motorcycle;
import models.Vehicle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
                Vehicle c1 = new Car(70);
                Vehicle m1 = new Motorcycle(45);

                System.out.println("Velocità macchina: " + c1.getSpeed());
                System.out.println("Velocità moto: " + m1.getSpeed());

                System.out.println("Numero ruote macchina: " + c1.getNumbersOfTires());
                System.out.println("Numero ruote moto: " + m1.getNumbersOfTires());
        }
}