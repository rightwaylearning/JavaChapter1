package Kalpesh;

public class Guards {

	String guardName;
	Integer guardIdNumber;
	Long guardphoneNumber;
	Double guardSallery;

	public Guards(String guardName, Integer guardIdNumber, Long guardphoneNumber, Double guardSallery) {
		super();
		this.guardName = guardName;
		this.guardIdNumber = guardIdNumber;
		this.guardphoneNumber = guardphoneNumber;
		this.guardSallery = guardSallery;
	}

	public String getGuardName() {
		return guardName;
	}

	public void setGuardName(String guardName) {
		this.guardName = guardName;
	}

	public Integer getGuardIdNumber() {
		return guardIdNumber;
	}

	public void setGuardIdNumber(Integer guardIdNumber) {
		this.guardIdNumber = guardIdNumber;
	}

	public Long getGuardphoneNumber() {
		return guardphoneNumber;
	}

	public void setGuardphoneNumber(Long guardphoneNumber) {
		this.guardphoneNumber = guardphoneNumber;
	}

	public Double getGuardSallery() {
		return guardSallery;
	}

	public void setGuardSallery(Double guardSallery) {
		this.guardSallery = guardSallery;
	}

	@Override
	public String toString() {
		return "Guards [" + guardName + ", " + guardIdNumber + ", "
				+ guardphoneNumber + ", " + guardSallery + "]";
	}

}
