package org.generations.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.generations.exceptions.CourseNotFoundException;

public class StudentService{
	private HashMap<String, Course> courseList = new HashMap<>();
	private HashMap<String, Student> students = new HashMap<>();
	private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public StudentService(){
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }//constructor student service

    //PUNTO 6 METODO AGREGAR STUDENTS
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }//assSrudents
    
    public void enrollStudents( String courseName, String studentID ) 
    		throws CourseNotFoundException{
        //PUNTO3
    	 if (! courseList.containsKey(courseName)) {
    		 throw new CourseNotFoundException(courseName);
    	 }//if
    	 if (! students.containsKey(studentID)) {
    		 throw new CourseNotFoundException(studentID);
    	 }//if
    	
    	Course course = courseList.get( courseName );
        
        
        if ( !coursesEnrolledByStudents.containsKey( studentID ) ){
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }//if
        coursesEnrolledByStudents.get( studentID ).add( course );//valor almacenado en elhasmap: lista de cursos 
    }//enrollstudent

    public void unEnrollStudents( String courseName, String studentID ){
        Course course = courseList.get( courseName );
        if ( coursesEnrolledByStudents.containsKey( studentID ) ){
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }//if
    }//unenroll

    public void showEnrolledStudents(String courseId){
        //TODO implement using collections loops
    	System.out.println(courseId + " enrolled:");
    	Course course = courseList.get(courseId);
    	for (String studenId : coursesEnrolledByStudents.keySet()) {
			List<Course> allCourses = coursesEnrolledByStudents.get(studenId);
			if(allCourses.contains(course)) {
				Student student = students.get(studenId);
				System.out.println(student);
			}//if
		}//foeach
    }//showenrrol

    public void showAllCourses(){
        //TODO implement using collections loops//,values traes los vaores de tipo curso//FORMA1
    	for (Course course: courseList.values()) {
    		System.out.println(course);
    	}//for
    }//sjowallcouse

    //CREATE GETTER && SETETER FOR STUDENTS 
	public HashMap<String, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}

}//clasestudenservice
