package Kalpesh;

public class Professer {
	private String professerName;
	private	Integer professerId;
	private	Double professerSallery;
	
	
	public Professer(String professerName, Integer professerId, Double professerSallery) {
		super();
		this.professerName = professerName;
		this.professerId = professerId;
		this.professerSallery = professerSallery;
	}
	public String getProfesserName() {
		return professerName;
	}
	public void setProfesserName(String professerName) {
		this.professerName = professerName;
	}
	public Integer getProfesserId() {
		return professerId;
	}
	public void setProfesserId(Integer professerId) {
		this.professerId = professerId;
	}
	public Double getProfesserSallery() {
		return professerSallery;
	}
	public void setProfesserSallery(Double professerSallery) {
		this.professerSallery = professerSallery;
	}
	
	
	@Override
	public String toString() {
		return "Professer [" + professerName + "" + professerId + ", "
				+ professerSallery + "]";
	}
	
	
	
	

}
