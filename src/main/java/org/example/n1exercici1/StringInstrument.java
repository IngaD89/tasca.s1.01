package org.example.n1exercici1;

public class StringInstrument extends Instrument {

    public static StringInstrument newInstance(){
         return new StringInstrument("Guitarra", 280);
    }

    public static StringInstrument newInstance(String name, double price){
        return new StringInstrument(name, price);
    }

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }

    @Override
    public String toString() {
        return "StringInstrument{" +
                " Name = " + super.getName() +
                " Price = " + super.getPrice() +
                " }";
    }
}
