package Poonam_Array_Assignment;

public class Array_freq_Check_Demo {
	
	private Integer item;
	private Integer count;
	
	public Array_freq_Check_Demo (Integer item,Integer count)
	{
		super();
		this.item=item;
		this.count=count;		
	}
	public Array_freq_Check_Demo()
	{
	}
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
		//return " [item=" + item + ", count=" + count + "]";
		return "[" + item + ",  >> " + count + "]";
	}
	
}
