package org.example.n1exercici1;

public class DrumInstrument extends Instrument {

    public DrumInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }

    @Override
    public String toString() {
        return "DrumInstrument{ " +
                "Name = " + super.getName() +
                " Price = " + super.getPrice() +
                " }";
    }
}
