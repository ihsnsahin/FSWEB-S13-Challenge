package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;
    //constructor
    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames = developerNames;
    }
    //Getter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGiro() {
        return giro;
    }
    public String[] getDeveloperNames() {
        return developerNames;
    }
    //Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGiro(double giro) {
        this.giro = giro < 0 ? 0 : giro;
    }
    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
    public void addEmployee(int index, String name){
        if (index <0 || index >= this.developerNames.length) {
            System.out.println("Geçersiz index numarası!");
        } else if (this.developerNames[index] == null) {
            this.developerNames[index] = name;
        } else {
            System.out.println("Seçili index dolu!");
        }
    }
    @Override
    public String toString () {
        return "Company{" +
                "id=" + id +
                ", name='" + name +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
