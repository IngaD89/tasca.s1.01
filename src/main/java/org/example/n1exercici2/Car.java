package org.example.n1exercici2;

public class Car {
    private final static String brand = "Audi";
    private static String model;
    private final int power;

    // dado que no puedo inicializar los atributos brand y model,
    // creo que este sería el constructor correcto
    public Car(int power) {
        this.power = power;
    }
    public Car(int power, String model) {
        /* el atributo brand siendo final y static no puedo inicializar ni modificar
        el atributo model siendo static no puedo inicializar,
        pero puedo modificar con setter o en este caso con metodo changeModel()
         */
        this.power = power;
    }

    public static String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public void setModel(String model) {
        Car.model = model;
    }

    // Se debe acceder a un atributo statico con el mismo contexto (statico)
    public static String changeModel(String model) {
       return Car.model = model;
    }

    public static void brake(){
        System.out.println("El vehicle està frenant.");
    }
    public void speedUp(){
        System.out.println("El vehicle està accelerant.");
    }

    @Override
    public String toString() {
        return "Car { " +
                "Brand = " + brand +
                " Model = " + model +
                " Power = " + power +
                " }";
    }
}
