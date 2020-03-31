package io.zipcoder;

public abstract class Pet implements Animal {

    private String type;
    private String name;
    private String noise;

    public Pet() {
    }
    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void setName(String name) { this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return noise;
    }
}

