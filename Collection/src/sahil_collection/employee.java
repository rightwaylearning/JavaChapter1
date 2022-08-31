package sahil_collection;

public class employee {
	
	private String name;
	private Integer id;
    private Double salary;
    
	public employee(String name, Integer id, int i) {
		super();
		this.name = name;
		this.id = id;
		this.salary = (double) i;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

    
}
