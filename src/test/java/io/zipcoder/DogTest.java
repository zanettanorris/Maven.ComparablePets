package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void testSetName() {
        Dog dog = new Dog();;
        dog.setName();
        String expected = "Jersey";

        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void getNumberOfDogs() {
        Dog dog = new Dog();
        int expected = 23;

        Assert.assertEquals(expected, dog.getNumberOfDogs);
    }
}

