import org.junit.Test;
import src.Sorting;

import java.io.File;
import java.util.Scanner;
import static org.junit.Assert.*;

/*
 * Juan Diego Avila Sastume    20090
 * Jose Daniel Gonzalez        20293
 * Hoja de trabajo 3: sorts      Clase: SortingTest.java
 * 14 de febrero del 2021*/

/**
 * SortingTest es la clase que contiene los 5 tests de los distintos sorts.**/
public class SortingTest {

    public Comparable<Integer>[] list;

    /**
     * PostCondition: regresa true, si realmente funciona el gnomeSort.**/
    @Test
    public void gnomeSort() {

        Integer[] data = {100,78,66,300,2};
        Integer[] expected = {2,66,78,100,300};

        Sorting.gnomeSort(data,data.length);

        assertArrayEquals(expected, data);

    }

    /**
     * PostCondition: regresa true, si realmente funciona el mergeSort.**/
    @Test
    public void mergeSort() {
        Integer[] data = {100,7,5,50,6};
        Integer[] expected = {5,6,7,50,100};

        Sorting.mergeSort(data,0, data.length-1);

        assertArrayEquals(expected, data);
    }

    /**
     * PostCondition: regresa true, si realmente funciona el quickSort.**/
    @Test
    public void quickSort() {
        Integer[] data = {30,27,5,100,6};
        Integer[] expected = {5,6,27,30,100};

        Sorting.quickSort(data,0, data.length-1);

        assertArrayEquals(expected, data);

    }

    /**
     * PostCondition: regresa true, si realmente funciona el radixSort.**/
    @Test
    public void radixSort() {
        Integer[] data = {100, 4560, 584, 63, 1200};
        Integer[] expected = {63,100,584,1200,4560};

        Sorting.radixSort(data);
        assertArrayEquals(expected, data);

    }

    /**
     * PostCondition: regresa true, si realmente funciona el bubbleSort.**/
    @Test
    public void bubbleSort() {
        Integer[] data = {2501, 488, 14, 233, 10000, 183};
        Integer[] expected = {14, 183, 233, 488, 2501, 10000};

        Sorting.bubbleSort(data);

        assertArrayEquals(expected, data);
    }
}