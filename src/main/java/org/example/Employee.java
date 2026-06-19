package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private  String fullName;
    private String email;
    private  String password;
    private String[] healthPlans;
    //Constructor
    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }
    //Getter
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }
    //Setter

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHealthplans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addHealthPlan(int index, String name){
        if (index <0 || index >= this.healthPlans.length) {
            System.out.println("Geçersiz index numarası!");
        } else if (this.healthPlans[index] == null) {
            this.healthPlans[index] = name;
        } else {
            System.out.println("Seçili index dolu!");
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName +
                ", email='" + email +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
