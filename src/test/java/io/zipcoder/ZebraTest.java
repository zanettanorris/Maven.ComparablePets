package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ZebraTest {

    @Test
    public void speakTest() {
        // Given
        Zebra zebra = new Zebra();
        String expected = "Meow";

        // When
        String actual = zebra.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        Zebra zebra = new Zebra();
        String expected = "Jelly Bean";

        Assert.assertEquals(expected, zebra.getName());
    }

    @Test
    public void testSetName() {
        Zebra zebra = new Zebra();
        zebra.setName();
        String expected = "Jersey";

        Assert.assertEquals(expected, zebra.getName());
    }

    @Test
    public void getNumberOfCats() {
        Zebra zebra = new Zebra();
        int expected = 2;

        Assert.assertEquals(expected, zebra.getNumberOfZebras);
    }
}

