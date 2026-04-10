
public class Course {

	private String Java;
	private String programming101;
	private int numberofstudents;
	
	public Course(String Java, String programming101, int numberofstudents) {
	
		this.Java = Java;
		this.programming101 = programming101;
		this.numberofstudents = numberofstudents;
		
	}
	public String getJava() {
		return Java;
	}
	public String getProgramming101() {
		return programming101;
	}
	public int getNumberofstudents() {
		return numberofstudents;
	}
	public String toString() {
		return "Course Code: "+this.Java+ " Course Name: "+this.programming101+ " Max Students: "+this.numberofstudents;
	}
	
	
	
	
}
