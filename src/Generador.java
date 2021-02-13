package src;

import java.util.*;
import java.io.*;


public class Generador {

    private Random rand;

    public Generador(){
        rand = new Random();
    }

    public void generar(int cantidad){
        
        Integer[] temp = new Integer[cantidad];

        for(int i = 0; i < cantidad ; i++){
            temp[i] = rand.nextInt(10000);
        }
        
        crearArchivo(temp);
    }
    
    private void crearArchivo(Integer[] datos){

        String name = "numeros.txt";
        File file = new File(name);

        String data = "";
        for(int x = 0; x<datos.length; x++){
            data += datos[x]+"\n";
        }
        

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
