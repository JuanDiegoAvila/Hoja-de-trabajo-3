import org.junit.Test;

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

        Generador generador = new Generador();
        Integer[] data;

        //parametro i se puede modificar para crear de 10 a 3000 listas.
        generador.generar(1000);
        data = new Integer[1000];
        //intenta leer el archivo para ver el contenido y asignarlo a el array data.
        try {
            Scanner input = new Scanner(new File("numeros.txt"));
            int cont = 0;
            while (input.hasNextLine()) { // por cada linea se lo asigna a data.
                data[cont] = Integer.parseInt(input.nextLine().trim());
                cont++;
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        //los 5 tipos de sorts que se pueden realizar

        Sorting.gnomeSort(data, data.length);

        //System.out.println("Datos ordenados por merge sort.");
        //Sorting.mergeSort(data, 0, data.length - 1);

        //System.out.println("Datos ordenados por quick sort.");
        //Sorting.quickSort(data, 0, data.length - 1);

        //System.out.println("Datos ordenados por radix sort.");
        //Sorting.radixSort(data);

        //System.out.println("Datos ordenados por bubble sort.");
        //Sorting.bubbleSort(data);

        // Imprime cada lista ordenada separada por un espacio.
        for (int j = 0; j < data.length; j++) {
            System.out.println(data[j] + " ");
        }
        System.out.println();
    }

    /**
     * PostCondition: regresa true, si realmente funciona el mergeSort.**/
    @Test
    public void mergeSort() {
        /*Integer[] data = {100,78,66,300,2};
        Integer[] expected = {2,66,78,100,300};

        Sorting.gnomeSort(data,data.length);

        assertArrayEquals(expected, data);*/

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