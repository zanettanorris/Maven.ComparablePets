package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CatTest {

    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat();
        String expected = "Meow";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        Cat cat = new Cat();
        String expected = "Jelly Bean";
        cat.setName(expected);
        Assert.assertEquals(expected, cat.getName());
    }

    @Test
    public void testSetName() {
        Cat cat = new Cat();
        String expected = "Jersey";
        cat.setName(expected);
        Assert.assertEquals(expected, cat.getName());
    }

    @Test
    public void getNumberOfCats() {
        ArrayList<Animal> testList = new ArrayList<Animal>();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        testList.add(cat);
        testList.add(cat2);
        int expected = 2;

        Assert.assertEquals(expected, testList.size());
    }
}
