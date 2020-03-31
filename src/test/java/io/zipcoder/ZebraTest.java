package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ZebraTest {

    @Test
    public void speakTest() {
        // Given
        Zebra zebra = new Zebra();
        String expected = "Woo";

        // When
        String actual = zebra.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        Zebra zebra = new Zebra();
        String expected = "Jelly Bean";
        zebra.setName(expected);

        Assert.assertEquals(expected, zebra.getName());
    }

    @Test
    public void testSetName() {
        Zebra zebra = new Zebra();
        String expected = "Jersey";
        zebra.setName(expected);
        Assert.assertEquals(expected, zebra.getName());
    }

    @Test
    public void getNumberOfZebrasTest() {
        ArrayList<Animal> testArray = new ArrayList<Animal>();
        Zebra zebra1 = new Zebra();
        testArray.add(zebra1);
        Zebra zebra2 = new Zebra();
        testArray.add(zebra2);
        int expected = 2;
        Assert.assertEquals(expected, testArray.size());
    }

}

