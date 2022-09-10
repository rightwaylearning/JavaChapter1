package Sonali_collection_Iterator;

public class Fr {
	
	int item;
	int count;
	public Fr(int item, int count) {
		super();
		this.item = item;
		this.count = count;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Fr [item=" + item + ", count=" + count + "]";
	}
	
	

}
