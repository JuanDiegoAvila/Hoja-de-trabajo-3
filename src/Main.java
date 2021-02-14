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
        for(int i = 50; i<= 3000; i+=500) {
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

            System.out.println("Datos ordenados por gnome sort.");
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
    }
}
