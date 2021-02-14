package src;

import java.io.*;
import java.util.Scanner;

/*
* Juan Diego Avila Sastume    20090
* Jose Daniel Gonzalez        20293
* Hoja de trabajo 3: sorts      Clase: Main.java
* 14 de febrero del 2021*/


/**
 * Main es la clase encargada de, através del generador, generar una lista de datos aleatorios y enviarlas al respectivo sort.
 * **/
public class Main {
    
    public static void main(String[] args) {
        
        Generador generador = new Generador();    
        Integer[] data;

        //parametro i se puede modificar para crear de 10 a 3000 listas.
        for(int i = 10; i<= 11; i++) {
            generador.generar(i);
            data = new Integer[i];
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
            //Sorting.mergeSort(data, 0, data.length - 1);
            //Sorting.quickSort(data, 0, data.length - 1);
           // Sorting.radixSort(data);
            //Sorting.bubbleSort(data);

            // Imprime cada lista ordenada separada por un espacio.
            for (int j = 0; j < data.length; j++) {
                System.out.println(data[j] + " ");
            }
            System.out.println();

        }
    }
}
