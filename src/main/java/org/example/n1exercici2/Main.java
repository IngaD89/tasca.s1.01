package org.example.n1exercici2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(120, Car.changeModel("A8"));
        System.out.println(car);

        Car car1 = new Car(220);
        car1.setModel("A6");
        System.out.println(car1);

        car1.speedUp();

        // el metodo brake() siendo estatico no puedo acceder con objeto
        // p.ej. car.bracke()
        Car.brake();
    }
}
