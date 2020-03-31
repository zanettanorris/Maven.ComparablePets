package io.zipcoder;

public abstract class Pet implements Comparable<Pet> {

    private String type;
    private String name;
    private String noise;

    public Pet() {
    }
    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Pet(String name) {
    }

    public void setName(String name) { this.name = name; }

    public String getName() {
        return this.name;
    }

    abstract public String speak();
//    {
//        return noise;
//    }

    public int compareTo(Pet otherPet) {
        if (this.name.equals(otherPet.getName())) {
            return this.getClass().getName().compareTo(otherPet.getClass().getName());
        } else {
            return this.name.compareTo(otherPet.getName());
        }
    }
}

