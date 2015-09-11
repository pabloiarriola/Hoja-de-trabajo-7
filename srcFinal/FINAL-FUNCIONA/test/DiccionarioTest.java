import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo Arriola
 */
public class DiccionarioTest {
    
   
    /**
     * Test of insertarNodo method, of class Diccionario.
     */
    @Test
    public void testInsertarNodo() {
        System.out.println("insertarNodo");
        BinaryTree<Association<String, String>> padre = null;
        Association<String, String> dato = null;
        Diccionario instance = new Diccionario();
        instance.insertarNodo(padre, dato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of traducirPalabra method, of class Diccionario.
     */
    @Test
    public void testTraducirPalabra() {
        System.out.println("traducirPalabra");
        BinaryTree<Association<String, String>> padre = null;
        String palabra = "";
        Diccionario instance = new Diccionario();
        String expResult = "";
        String result = instance.traducirPalabra(padre, palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
