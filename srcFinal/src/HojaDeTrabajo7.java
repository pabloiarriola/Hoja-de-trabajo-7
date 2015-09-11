/*
Universidad del Valle de Guatemala
Hoja de Trabajo 7 
Pablo Arriola 131115
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class HojaDeTrabajo7 {


    /**
     
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    prueba lector= new prueba();
    lector.leerArchivo();
    
    Traductor traductor = new Traductor();
    traductor.seleccionarArchivo();
        
    }
}
