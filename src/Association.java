import java.util.Map;
import java.util.Map.Entry;



public class Association implements Map.Entry { 
	public Association(Object key, Object value) 
	// pre: key is non-null 
	// post: constructs a key-value pair
	public Association(Object key) 
	// pre: key is non-null 
	// post: constructs a key-value pair; value is null
	public boolean equals(Object other) 
	// pre: other is non-null Association 
	// post: returns true iff the keys are equal
	public Object getValue() 
	// post: returns value from association
	public Object getKey() 
	// post: returns key from association
	public Object setValue(Object value) 
	// post: sets association's value to value
}
