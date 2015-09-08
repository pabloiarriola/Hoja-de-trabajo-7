import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Arriola
 */
public class LeerDiccionario {
    
    
    BinaryTree arbol= new BinaryTree();
        public  void leerArchivo(){
    
       
         /*Declaracion de variables*/
        String micadena = null;
        String linea=null;
        
        
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
            
            while ((linea = br.readLine())!=null)
            {
                
                System.out.println(linea);
                
                
                
               
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
        StringTokenizer tokens = new StringTokenizer(linea,",");
        
        
        
        
        /*Se revisan los caracteres del archivo uno por uno*/
        while (tokens.hasMoreTokens())
        {
            
            /*Se almacena el caracter en un string para comprarlo
             ya sea con un '+' o '-' o '*' o '/'*/
            String token;
            
            token = tokens.nextToken();
            
            
            //System.out.println("El token actual es: " + token);
            /*Si es un caracter de operacion se sacan dos elementos de la pila,
             se almacenan en variables y depues se operan*/
            if ((token.equals("(")) ||(token.equals(")"))|| (token.equals(",")))
            {
                
                  
                  String spanish="";
                  String english="";
                 // operando1 = Integer.parseInt(miStack.pop());
                  //operando2 = Integer.parseInt(miStack.pop());
                  
                  if (token.equals("("))
                  {
                      
                      while (token!=","){
                        token = tokens.nextToken();
                          
                        if (token!=","){
                        english+=token;
                        }
                          System.out.println("engish"+token);
                      }
                     
                  }
                  else if (token.equals(","))
                  {
                      while (token!=")"){
                        token = tokens.nextToken();
                        if (token!=")"){
                        spanish+=token;
                        }
                      }
                  }
                  else if (token.equals(")"))
                  {
                      arbol.addNode(english,spanish);
                  }
                  
            }
            else 
            {
              JOptionPane.showMessageDialog(null, "la cagaste ._.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
   
            }
        }
        
        
    }
    //metodo para leer el archivo      
    
    
    
    
}
