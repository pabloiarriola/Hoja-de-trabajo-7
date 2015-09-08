import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Arriola
 */
public class prueba {
    BinaryTree arbol=  BinaryTree.binarytree;
    
    public  void leerArchivo(){
    
       
         /*Declaracion de variables*/
        String micadena = null;
        String linea=null;
        Node nodo;
        
        
        FileReader fr;
        BufferedReader br;
                
        
        try
        {
            /*Se crea un objeto que permite abrir el archivo de texto*/
            AbrirJFileChooser abrirArchivo = new AbrirJFileChooser();
            abrirArchivo.Abrir(); /*Se selecciona el archivo de texto*/
            String ruta =abrirArchivo.getPath(); /*Se obtiene la ruta del
                                                    archivo de texto*/
           
            
            /*Lectura del archivo*/
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            
            while ((micadena = br.readLine())!=null)
            {
                linea = micadena;
                String vector[]=linea.split(",");
                System.out.println(micadena);
                //System.out.println("debug1");
                arbol.addNode(vector[0],vector[1]);
                //System.out.println("debug2");
                System.out.println(vector[0]);
                System.out.println(vector[1]);
                nodo=arbol.findNode(vector[0]);
                System.out.println(nodo);
                //System.out.println("debug3");
               
            }
          
        }
        
        /*Error en caso de que no se pueda leer el archivo*/
        catch(Exception e)
        {
            System.out.println("Hubo un error leyendo el archivo. No se"
                    + "encuentra el archivo 'datos.txt'");
            
            
             /*Si hubo error cargando el archivo, termina el programa*/
            System.exit(0);
        }
        
        /*Despues de leer el archivo*/
        /*Se crea un string tokenizer*/
        //System.out.println(linea);
      
        
    }
    //metodo para leer el archivo      
    
}
