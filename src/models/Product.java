package models;

public class Product {
    String id;
    String name;
    double price;

    public Product(String id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getDetails(){
        System.out.println("*** Dettaglio prodotto ***");
        System.out.println("Prodotto_ID: " + this.getId() + ", Nome: " + this.getName() + ", Prezzo: " + this.getPrice() + " €");
    }

    public void updatePrice(double price){
        double old_price;
        old_price=this.price;
        System.out.println("Prezzo vecchio: " + old_price);
        this.price=price;
        System.out.println("Prezzo nuovo: " + price);
        if(old_price!=price){
            System.out.println("Prezzo aggiornato con successo!");
        }else{
            System.out.println("Prezzo non aggiornato!");
        }
    }

    public double inventoryPrice(){
        //double singolo = 0;
        //singolo=singolo+this.getPrice();
        return this.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
