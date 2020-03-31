package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class PetTest {

    @Test
    public void nameSortTest() {
        Zebra testZebra2 = new Zebra("zebra", "Apple");
        Zebra testZebra = new Zebra("zebra", "Elvis");
        Cat testCat2 = new Cat("cat", "Garfield");
        Cat testCat3 = new Cat("cat", "Jeff");
        Dog testDog2 = new Dog("dog", "Jeff");
        Dog testDog = new Dog("dog", "Rex");
        Cat testCat = new Cat("cat", "Socks");

        //expectedArray made up of pets added in expected order:
        //sort by name first, then by type if names are the same.
        ArrayList<Pet> expectedArray = new ArrayList<Pet>();
        expectedArray.add(testZebra2);
        expectedArray.add(testZebra);
        expectedArray.add(testCat2);
        expectedArray.add(testCat3);
        expectedArray.add(testDog2);
        expectedArray.add(testDog);
        expectedArray.add(testCat);

        ArrayList<Pet> petTestArray = new ArrayList<Pet>();
        petTestArray.add(testCat);
        petTestArray.add(testCat2);
        petTestArray.add(testCat3);
        petTestArray.add(testDog);
        petTestArray.add(testDog2);
        petTestArray.add(testZebra);
        petTestArray.add(testZebra2);

        Collections.sort(petTestArray);
        //expected order should match sort output.
        Assert.assertEquals(expectedArray, petTestArray);
        //The above lines are asking for a List instead of an ArrayList.
        //I think implementing comparable should fix it but
        //if it does not let me know, I can look into it further.

    }
}

