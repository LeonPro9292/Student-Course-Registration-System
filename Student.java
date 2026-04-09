
public class Student {
	
	
	
	private String name;
	private int id;
	private int gradeLevel;
	
	public Student (String name, int id, int gradeLevel) {
		this.name = name;
		this.id = id;
		this.gradeLevel = gradeLevel;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public String toString(){
		return "Name: "+this.name+ ": Id: "+this.id+ " :Grade level: "+this.gradeLevel;
	}
}
