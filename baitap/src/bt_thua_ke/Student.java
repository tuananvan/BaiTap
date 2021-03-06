/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_thua_ke;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class Student extends Person {
    @Override
	public int compareTo(Student o) {
		
		if(this.getGpa() > o.getGpa()) {
			return 1;
		}
		else if(this.getGpa() == o.getGpa()) {
			if(this.getSoicialActivities() > o.getSoicialActivities()) {
				return 1;
			}
			else if(this.getSoicialActivities() == o.getSoicialActivities()) {
				return 0;
			}
			else {
				return -1;
			}
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		return "Student: studentID: " + studentID + ", academicYear: " + academicYear + ", gpa: " + gpa
				+ ", soicialActivities: " + soicialActivities + ", name: " + name + ", gender: " + gender + ", birthYear: "
				+ birthYear;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public float getSoicialActivities() {
		return soicialActivities;
	}
	public void setSoicialActivities(float soicialActivities) {
		this.soicialActivities = soicialActivities;
	}
	String studentID;
	int academicYear;
	float gpa;
	float soicialActivities;
	
	
	public Student(String name, char gender, int birthYear, String studentID, int academicYear, float gpa,
			float soicialActivities) {
		super(name, gender, birthYear);
		this.studentID = studentID;
		this.academicYear = academicYear;
		this.gpa = gpa;
		this.soicialActivities = soicialActivities;
	}
	
	
	
	public Student() {
		super();
	}
	public void setInfo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nh???p h??? t??n: ");
		this.setName(input.next());

		System.out.print("Nh???p m?? sv: ");
		this.setStudentID(input.next());
		
		System.out.print("Nh???p n??m sinh: ");
		this.setBirthYear(input.nextInt());
		
		System.out.print("Nh???p gi???i t??nh: ");
		this.setGender(input.next().charAt(0));
		
		System.out.print("Nh???p n??m h???c: ");
		this.setAcademicYear(input.nextInt());
		
		System.out.print("Nh???p gpa: ");
		this.setGpa(input.nextFloat());
		
		System.out.print("Nh???p soicialActivities: ");
		this.setSoicialActivities(input.nextFloat());
	}
}
