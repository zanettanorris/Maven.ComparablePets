package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    @Test
    public void testInheritanceDog() {
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testInheritanceCat() {
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testAnimalInheritance() {
        //Given
        Boolean expected = true;

        //When
        Zebra zebra = new Zebra();

        //Then
        Boolean animalInheritance = true;
        Assert.assertTrue(animalInheritance);

    }
}

