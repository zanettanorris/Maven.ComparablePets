package io.zipcoder;

public class Dog extends Pet implements Animal {
    String noise;
    private String name;
    private String speak;
    public int getNumberOfDogs;
    private String expectedNoise;

    public Dog(String name) {
        super(name);
        noise = "meow";
    }
    public Dog(){

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

//    @Override
//    public String speak(expectedNoise) {
//        return expectedNoise;
//    }
}
