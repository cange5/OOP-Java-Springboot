package models;

public class Counter {
    public static int count=0;
    int number;

    public Counter(int number){
        this.number=number;
    }

    public static void incrementCount(){
        count+=1;
    }

    public static int getCount(){
        return count;
    }

    public void setNumber(int number){
        this.number=number;
    }

    public int getNumber(){
        return this.number;
    }
}
