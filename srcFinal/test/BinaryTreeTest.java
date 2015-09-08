import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo Arriola
 */
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNode method, of class BinaryTree.
     */
    @Test
    public void testAddNode() {
        System.out.println("addNode");
        BinaryTree instance = new BinaryTree();
        instance.addNode("1", "Primero");
        System.out.println("Se agregó: (1, Primero)");
        Node resultado = instance.findNode("1");
        System.out.println("Se encontro:"+resultado); 
    }

    

   

    /**
     * Test of findNode method, of class BinaryTree.
     */
    @Test
    public void testFindNode() {
        System.out.println("findNode");
        BinaryTree instance = new BinaryTree();
        instance.addNode("1", "Primero");
        System.out.println("Se agregó: (1, Primero)");
        Node resultado = instance.findNode("1");
        System.out.println("Se busco:1, encontro:"+resultado); 
    }

    
}
