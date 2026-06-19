package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;
    //Constructor
    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }
    //Getter
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Plan getPlan() {
        return this.plan;
    }
    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name +
                ", plan=" + plan +
                '}';
    }
}
