import models.Car;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
                Car c1 = new Car("Model 3", "Tesla", 2018);
                System.out.println(c1.model);
                System.out.println(c1.manufacture);
                System.out.println(c1.year);
        }
}