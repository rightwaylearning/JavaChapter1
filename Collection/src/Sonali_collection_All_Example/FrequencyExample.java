package Sonali_collection_All_Example;

public class FrequencyExample {
	Integer Number;
	Integer count;
	
	public FrequencyExample(Integer number, Integer count) {
		super();
		Number = number;
		this.count = count;
	}

	  FrequencyExample(){
		  
	  }
	public Integer getNumber() {
		return Number;
	}

	public void setNumber(Integer number) {
		Number = number;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "FrequencyExample [Number=" + Number + ", count=" + count + "]";
	}
	
	

}
