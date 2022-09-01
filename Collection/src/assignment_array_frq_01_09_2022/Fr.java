package assignment_array_frq_01_09_2022;

public class Fr {

	private Integer item;
	private Integer count;
	
	public Fr(Integer item, Integer count) {
		super();
		this.item = item;
		this.count = count;
	}
	
	public Fr() {}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "[" + item + ",  >> " + count + "]";
	}
	
}
