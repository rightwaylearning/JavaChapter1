package Assignmentfr01092022;

public class CountNumber {

	private Integer item;
	private Integer count;
	public CountNumber(Integer item, Integer count) {
		super();
		this.item = item;
		this.count = count;
	}
	public CountNumber()
	{}
	
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
		return "CountNumber [item=" + item + ", count=" + count + "]";
	}
	
}
