package org.example.n1exercici1;

import org.example.n1exercici1.DrumInstrument;
import org.example.n1exercici1.Instrument;
import org.example.n1exercici1.StringInstrument;
import org.example.n1exercici1.WindInstrument;

public class Main {
    public static void main(String[] args) {

        Instrument instrument = new DrumInstrument("Drum", 1500);
        System.out.println(instrument);
        instrument.play();

        WindInstrument windInstrument = new WindInstrument("Flauta", 35.8);
        System.out.println(windInstrument);
        windInstrument.play();

        Instrument instrument1 = StringInstrument.newInstance();
        System.out.println(instrument1);
        instrument1.play();

        Instrument instrument2 = StringInstrument.newInstance("Violin", 2500);
        System.out.println(instrument2);
        instrument2.play();



    }
}