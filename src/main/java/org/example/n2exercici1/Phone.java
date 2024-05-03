package org.example.n2exercici1;

public class Phone implements Camera, Clock {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void call(String phoneNumber){
        System.out.println("s’està trucant al número " + phoneNumber + "! ");
    }

    @Override
    public void shoot() {
        System.out.println("S’està fent una foto");
    }

    @Override
    public void alarm() {
        System.out.println("Està sonant l’alarma");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }
}
