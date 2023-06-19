import models.Product;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
                double somma = 0;
                Map<String, Product> p = new HashMap<>();
                Product p1 = new Product(
                        "A1",
                        "Spazzolino",
                        6
                );
                Product p2 = new Product(
                        "A2",
                        "Specchio",
                        15
                );
                Product p3 = new Product(
                        "A3",
                        "Shampoo",
                        10
                );
                p.put(p1.getId(), p1);
                p.put(p2.getId(), p2);
                p.put(p3.getId(), p3);
                //Stampo l'inventario, ciclando l'HashMap p invece di usare System.out.println(p);
                for (Map.Entry<String, Product> ele: p.entrySet()) {
                        System.out.println("Inventario_ID: " + ele.getKey());
                        ele.getValue().getDetails();
                }
                //Ritorno i dettagli di uno specifico prodotto
                p.get("A1").getDetails();
                //Rimuovo il prodotto con uno specifico ID
                System.out.println("Eliminazione <<<" + p.get("A2") + ">>> in corso...");
                if(isNull(p.remove("A2"))){
                        System.out.println("Prodotto non eliminato!");
                }else{
                        System.out.println("Prodotto eliminato con successo!");
                }
                //Aggiorno il prezzo prodotto dato uno specifico ID
                System.out.println("Aggiornamento prezzo <<<" + p.get("A1") + ">>> in corso...");
                p.get("A1").updatePrice(30);
                System.out.println(p);
                //Calcolo l'ammontare totale dell'inventario, ciclo l'HashMap p
                System.out.println("Calcolo costo inventario in corso...");
                for (Map.Entry<String, Product> ele: p.entrySet()) {
                        somma = somma + ele.getValue().inventoryPrice();
                }
                System.out.println("Il costo totale dell'inventario è: " + somma + " €");
        }
}