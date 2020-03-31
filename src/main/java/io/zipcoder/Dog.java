package io.zipcoder;

public class Dog implements Animal {
    private String name;
    private String speak;
    public int getNumberOfDogs;
    public Dog() {

    }
    public Dog(String type, String name) {

    }

    public void setName(String name) { this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Ruffruff";
    }
}
