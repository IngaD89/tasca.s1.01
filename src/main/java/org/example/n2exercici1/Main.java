package org.example.n2exercici1;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung", "Galaxy");

        smartPhone.call("642 52 22 05");
        smartPhone.alarm();
        smartPhone.shoot();
    }
}
