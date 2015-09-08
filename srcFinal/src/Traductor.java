import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author Pablo Arriola
 * Esta clase traduce un texto en un archivo
 */
public class Traductor {
    private String micadena;
    private FileReader fr; //File reader
    private BufferedReader br; //BufferedReader
    private BinaryTree arbol = BinaryTree.binarytree;
     Node nodo;
    

    
    
    public Traductor()
    {
        
    }
    
    /**
     * Abre el archivo que se va a utilizar
     */
    public void seleccionarArchivo()
    {
        //Sirve para leer el archivo 
        AbrirJFileChooser abrir = new AbrirJFileChooser();
        abrir.Abrir();
        String ruta =abrir.getPath();
        
       
        
        try 
        {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            
            while ((micadena = br.readLine())!=null)
            {
                System.out.println(micadena);
                
                StringTokenizer tokens = new StringTokenizer(micadena," ");    
        
                while (tokens.hasMoreTokens())
                {
                    String token = tokens.nextToken();
                    //System.out.println(token);
                    
                    
                    /*Se buscan las palabras en el arbol*/
                    //System.out.println("--------------");
                    nodo = arbol.findNode(token);
                    //System.out.println("-------:C------");
                    System.out.println(nodo.toString());
                    
                }
                
               
            }
        }
        catch (Exception e)
        {
            System.out.println("Hubo un error leyendo el archivo");
        }
            
        //Separa las palabras del archivo    
        
    }
    
}
