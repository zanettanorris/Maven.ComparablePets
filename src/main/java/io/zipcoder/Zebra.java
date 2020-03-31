package io.zipcoder;

public class Zebra extends Pet implements Animal {
    private String type;
    private String name;
    public Integer NumberOfZebras;
    public Zebra() {
    }

    public Zebra(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void setName(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Woo";
    }

    public Integer getNumberOfZebras(){
        return NumberOfZebras;
    }
}

