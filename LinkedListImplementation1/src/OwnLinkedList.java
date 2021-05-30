
public class OwnLinkedList implements NodeList{
	private ListItem root =null;
	
	public OwnLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if(this.root == null) {
			this.root = newItem;
			return true;
		}
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = (currentItem.compareTo(newItem));
			if(comparison < 0) {//greater
				if(currentItem.next() != null) {
					currentItem = currentItem.next();
					//just going forward
				}else {//otherwise we reached the end (i.e currentItem.next== null)
					currentItem.setNext(newItem).setPrevious(currentItem);
					return true;
				}
			}else if(comparison > 0) {//less
				if(currentItem.previous() != null) {
					currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
					newItem.setNext(currentItem).setPrevious(newItem);
				}else {
					newItem.setNext(this.root).setPrevious(newItem);
					this.root = newItem;
				}
				return true;
			}
			else {// equal bala case
				System.out.println(newItem.getValue()+" is already present, not added.");
				return false;
			}
		}
		return false;
	
	}

	@Override
	public boolean removeItem(ListItem item) {
		if(item != null) {	
			System.out.println("Deleting item "+item.getValue());
		}
		
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if(comparison == 0) {
				if(currentItem == this.root) {
					this.root = currentItem.next();
					//we've just setting it but not deleted
				}else {
					currentItem.previous().setNext(currentItem.next());
					if(currentItem.next() != null) {
						currentItem.next().setPrevious(currentItem.previous());
					}
				}return true;
			}else if(comparison < 0) {
				currentItem = currentItem.next();
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		if(root == null) {
			System.out.println("the list is empty");
		}else {
		while(root != null) {  //why not this.root
			System.out.println(root.getValue());
			root = root.next();
		   }
		}			
		
	}

}
