package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Healthplan healthplan = new Healthplan(1, "Axa Sigorta", Plan.BASIC);
        System.out.println(healthplan.toString());
        Healthplan healthplan2 = new Healthplan(2, "Şahin Sigorta", Plan.ADVANCE);
        System.out.println(healthplan2.toString());
        // Employee
        String[] saglikPlani = new String[3];
        Employee employee1 = new Employee(1, "İhsan Şahin", "ihsansahin777@gmail.com", "12345", saglikPlani);
        employee1.addHealthPlan(4, healthplan.getName());
        System.out.println(employee1.toString());
        employee1.addHealthPlan(1, healthplan.getName());
        System.out.println(employee1.toString());
        //Company
        String[] developers = new String[5];
        Company company1 = new Company(1, "Sahin Software", 50000.0, developers);
        System.out.println(company1.toString());
        company1.addEmployee(3, employee1.getFullName());
        System.out.println(company1.toString());

    }
}