/**
 *
 * @author Pablo Arriola
 * Código tomado de material visto en clase
 */

/*
public class BinaryTree<E>
{

    protected E val; // value associated with node
	protected BinaryTree<E> parent; // parent of node
	protected BinaryTree<E> left, right; // children of node
	
	public BinaryTree()
	// post: constructor that generates an empty node
	{
		val = null;
		parent = left = right= null; 
	}
	
	public BinaryTree(E value)
	// post: returns a tree referencing value and two empty subtrees
	{
		val = value;
		right = left = new BinaryTree<E>();
		setLeft(left);
		setRight(right);
	}
	
	public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right)
	// post: returns a tree referencing value and two subtrees
	{
		val = value;
		if (left == null) { left = new BinaryTree<E>(); }
		setLeft(left);
		if (right == null) { right = new BinaryTree<E>(); }
		setRight(right);
	}
	
	public BinaryTree<E> left()
	// post: returns reference to (possibly empty) left subtree
	// post: returns reference to (possibly empty) left subtree
	{
		return left;
	}
        
        public BinaryTree<E> right()
	// post: returns reference to (possibly empty) left subtree
	// post: returns reference to (possibly empty) left subtree
	{
		return right;
	}
	
	public BinaryTree<E> parent()
	// post: returns reference to parent node, or null
        {
            return parent;
        }
	public void setLeft(BinaryTree<E> newLeft)
	// post: sets left subtree to newLeft
	// re-parents newLeft if not null
	{
		//if (isEmpty()) return;
		//if (left != null && left.parent() == this) left.setParent(null);
                
		left = newLeft;
		left.setParent(this);
	}
        
        public void setRight(BinaryTree<E> newLeft)
	// post: sets left subtree to newLeft
	// re-parents newLeft if not null
	{
		//if (isEmpty()) return;
		//if (right != null && right.parent() == this) right.setParent(null);
		right = newLeft;
		right.setParent(this);
	}
	
	protected void setParent(BinaryTree<E> newParent)
	// post: re-parents this node to parent reference, or null
	{
		if (!isEmpty()) {
		parent = newParent;
		}
	}
	
	public E value()
	// post: returns value associated with this node
	{
		return val;
	}
	
	public void setValue(E value)
	// post: sets the value associated with this node
	{
		val = value;
	}
        
        public boolean isEmpty(){
            if(val==null){
                return false;
            }else{
                return true;
            }
        }
	
}
*/

public class BinaryTree<E>
{
    protected E val; // value associated with node
    protected BinaryTree<E> parent; // parent of node
    protected BinaryTree<E> left, right; // children of node
    
    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right, BinaryTree<E> parent){
        val=value;
        this.left=left;
        this.right=right;
        this.parent=parent;
    }
    
    public BinaryTree<E> left()
    // post: returns reference to (possibly empty) left subtree
    // post: returns reference to (possibly empty) left subtree
    {
            return left;
    }

    public BinaryTree<E> right()
    // post: returns reference to (possibly empty) left subtree
    // post: returns reference to (possibly empty) left subtree
    {
            return right;
    }

    public BinaryTree<E> parent()
    // post: returns reference to parent node, or null
    {
        return parent;
    }
    
    public void setLeft(BinaryTree<E> newLeft){
        this.left=newLeft;
    }
    
    public void setRight(BinaryTree<E> newRight){
        this.right=newRight;
    }
    
    public void setParent(BinaryTree<E> newParent){
        this.left=newParent;
    }
    
    public E value()
	// post: returns value associated with this node
	{
		return val;
	}
	
	public void setValue(E value)
	// post: sets the value associated with this node
	{
		val = value;
	}
    
}
