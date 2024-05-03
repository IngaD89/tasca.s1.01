package org.example.n1exercici1;

public class WindInstrument extends Instrument{

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }

    @Override
    public String toString() {
        return "WindInstrument{ " +
                "Name = " + super.getName() +
                " Price = " + super.getPrice() +
                " }";
    }
}
