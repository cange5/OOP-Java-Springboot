import models.Counter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
                Counter c1 = new Counter(2);
                Counter c2 = new Counter(3);
                Counter.incrementCount();
                System.out.println("Counter di C1 (dopo 1 incremento): " + c1.getCount() + ", Number di C1: " + c1.getNumber());
                Counter.incrementCount();
                System.out.println("Counter di C1 (dopo 2 incremento): " + c1.getCount() + ", Number di C1: " + c1.getNumber());
                System.out.println("Counter di C2 (dopo incrementi): " + c2.getCount() + ", Number di C2: " + c2.getNumber());

        }
}