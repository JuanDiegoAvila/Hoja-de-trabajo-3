import java.util.*;
import java.io.*;

/*
 * Juan Diego Avila Sastume    20090
 * Jose Daniel Gonzalez        20293
 * Hoja de trabajo 3: sorts      Clase: Generador.java
 * 14 de febrero del 2021*/

/**
 * Generador es la clase que se encarga de llenar una lista con datos aleatorios y de ingresarlos al archivo de texto numeros.txt
 * **/
public class Generador {

    private Random rand;

    /**
     * Constructor del tipo Geneerador
     * **/
    public Generador(){
        rand = new Random();
    }

    /**
     * Precondition: cantidad no es igual a cero.
     * Postcondition: llama al metodo crearArchivo con el contenido de la nueva lista.
     * **/
    public void generar(int cantidad){
        
        Integer[] temp = new Integer[cantidad];

        //almacena numeros aleatorios en la nueva lista temporal.
        for(int i = 0; i < cantidad ; i++){
            temp[i] = rand.nextInt(10000);
        }
        
        crearArchivo(temp);
    }

    /**
     * Precondition: datos no es una lista vacia
     * Postcondition: agrega de forma correcta el contenido de la lista al archivo de texto numeros.txt**/
    private void crearArchivo(Integer[] datos){

        String name = "numeros.txt";
        File file = new File(name);

        //almacena los numeros de la lista en un string
        String data = "";
        for(int x = 0; x<datos.length; x++){
            data += datos[x]+"\n";
        }
        

        // codigo obtenido de http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
        if (file.exists()) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(name, false));
                bw.write(data);
                
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            
        }else{

        }
        
    }
}
