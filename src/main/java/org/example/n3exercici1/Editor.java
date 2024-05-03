package org.example.n3exercici1;

import java.util.ArrayList;

public class Editor {
    private String name;
    private final String dni;
    private double salary;
    private ArrayList<News> news;

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.salary = 1500;
        this.news = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return this.dni;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<News> getNews() {
        return this.news;
    }

    public void setNews(News news) {
        this.news.add(news);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "name = '" + this.name + '\'' +
                ", dni = '" + this.dni + '\'' +
                ", salary = " + this.salary +
                ", news = " + this.news +
                '}';
    }
}
