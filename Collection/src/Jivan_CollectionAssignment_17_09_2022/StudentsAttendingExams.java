package Jivan_CollectionAssignment_17_09_2022;

import java.util.Collection;

public class StudentsAttendingExams {
	private String name;
	private Integer seatNumber;
	private String exam;

	public StudentsAttendingExams(String name, Integer seatNumber, String exam) {
		super();
		this.name = name;
		this.seatNumber = seatNumber;
		this.exam = exam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getExam() {
		return exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "StudentsAttendingExams [name=" + name + ", seatNumber=" + seatNumber + ", exam=" + exam + "]";
	}

}
