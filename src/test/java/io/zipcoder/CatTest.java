package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertEquals(expected, cat.getName());
    }

    @Test
    public void testSetName() {
        Cat cat = new Cat();
        cat.setName();
        String expected = "Jersey";

        Assert.assertEquals(expected, cat.getName());
    }

    @Test
    public void getNumberOfCats() {
        Cat cat = new Cat();
        int expected = 23;

        Assert.assertEquals(expected, cat.getNumberOfCats);
    }
}
