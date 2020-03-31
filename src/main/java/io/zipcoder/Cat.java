package io.zipcoder;

public class Cat extends Pet implements Animal {
    private String name;
    private String type;
    public int getNumberOfCats;
    public Cat() {

    }

    public Cat(String type, String name) {
        this.name = name;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;
    }

    public String speak() {
        return "Meow";
    }
}