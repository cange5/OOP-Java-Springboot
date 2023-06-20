package models;

public class Counter {
    static int count=0;
    int number;

    public Counter(int number){
        this.number=number;
    }

    static void incrementCount(){
        count++;
    }

    static int getCount(){
        return count;
    }

    void setNumber(int number){
        this.number=number;
    }

    int getNumber(){
        return this.number;
    }
}
