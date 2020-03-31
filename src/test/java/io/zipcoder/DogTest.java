package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DogTest {

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog();
        String expected = "Ruffruff";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        Dog dog = new Dog();
        String expected = "Jelly Bean";
        dog.setName(expected);
        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void testSetName() {
        Dog dog = new Dog();
        String expected = "Jersey";
        dog.setName(expected);

        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void getNumberOfDogs() {
        ArrayList<Animal> testArray = new ArrayList<Animal>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        testArray.add(dog1);
        testArray.add(dog2);
        testArray.add(dog3);
        int expected = 3;
        Assert.assertEquals(expected, testArray.size());
    }
}

