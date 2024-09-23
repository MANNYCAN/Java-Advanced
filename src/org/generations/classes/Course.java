package org.generations.classes;

public class Course{
	private String name;
	private int credits;
	private String professorName;

    public Course( String name, int credits, String professorName ){
        this.name = name;
        this.credits = credits;
        this.professorName = professorName;
    }//constructor
    
 //PUNTO 4 ENCAPSULAMIENTO (PRIVATE PROPITIES Y SET & GET)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	//PASO NUMERO 2 IMPIMIR TODOS LOS CUROSS
	@Override
	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + ", professorName=" + professorName + "]";
	}//toString
	
	
    

}//class course
