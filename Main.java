import java.io.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Generador generador = new Generador();    
        Integer[] data;
        for (int i = 10; i <= 11; i++) {
            generador.generar(i);
            data = new Integer[i];
            try{
                Scanner input = new Scanner(new File("numeros.txt"));
                int cont = 0;
                while(input.hasNextLine() && cont < i){
                    data[cont] = Integer.parseInt(input.nextLine().trim());
                    cont++;
                }
                input.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
            //Sorting.gnomeSort(data);
            //Sorting.mergeSort(data);
            //Sorting.quickSort(data, 0, data.length-1);
            Sorting.radixSort(data);

            for(int j = 0; j<data.length;j++){
                System.out.println(data[j]+" ");
            }
            System.out.println();
            
            
            
            
            //Sorting.bubbleSort(data);
        }            
    }
}
