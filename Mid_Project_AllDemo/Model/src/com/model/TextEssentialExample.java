package com.model;

public class TextEssentialExample {
    public TextEssentialExample() {
        super();
    }
    
    private int id;
    private String lastName;
    
    
    public String sayHi(String name){
        return "hi visitor " + name;
        }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
