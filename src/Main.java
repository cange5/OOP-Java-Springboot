import models.Counter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
                Counter c1 = new Counter(2);
                Counter c2 = new Counter(3);
                //incremento count e lo stampo tramite un'istanza di c1
                Counter.incrementCount();
                System.out.println("Counter di C1 (dopo 1 incremento): " + c1.getCount() + ", Number di C1: " + c1.getNumber());
                //incremento nuovamente count e lo stampo nuovamente tramite c1
                Counter.incrementCount();
                System.out.println("Counter di C1 (dopo 2 incremento): " + c1.getCount() + ", Number di C1: " + c1.getNumber());
                //stampo count tramite variabile c2, esso avrà lo stesso valore stampato tramite c1
                System.out.println("Counter di C2 (dopo incrementi): " + c2.getCount() + ", Number di C2: " + c2.getNumber());
                //cambio valore della variabile number di c1
                c1.setNumber(10);
                System.out.println("Number di C1 dopo averlo cambiato: " + c1.getNumber());
                //il valore della variabile number di c2 non cambia
                System.out.println("Number di C2 (non cambia): " + c2.getNumber());

        }
}