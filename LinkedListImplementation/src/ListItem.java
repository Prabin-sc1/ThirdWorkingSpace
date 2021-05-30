//what must be implemented
public abstract class ListItem {
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;

	protected Object value;

	public ListItem(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
//actually i'm implementing doubly linked list  
	abstract ListItem next();

	abstract ListItem setNext(ListItem item);
	
	abstract ListItem previous();
	
	abstract ListItem setPrevious(ListItem item);
	
	abstract int compareTo(ListItem item);

}
