package org.generations;
import org.generations.classes.Student;
import org.generations.classes.StudentService;
import org.generations.classes.Course;
import org.generations.exceptions.CourseNotFoundException;
import org.generations.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
	    studentService.addStudent(new Student( "Carlos", "1030", 31 ));
	    studentService.addStudent(new Student( "Ian", "1040", 28 ) );
	    studentService.addStudent(new Student( "Elise", "1050", 26 ));
	    studentService.addStudent(new Student( "Santiago", "1020", 33 ));

//        studentService.getStudents().put( "1030", new Student( "Carlos", "1030", 31 ) );
//        studentService.getStudents().put( "1040", new Student( "Ian", "1040", 28 ) );
//        studentService.getStudents().put( "1050", new Student( "Elise", "1050", 26 ) );
//        studentService.getStudents().put( "1020", new Student( "Santiago", "1020", 33 ) );

        //studentService.enrollStudents( "Math", "1030" );
        //System.out.println(StudentService.showAllCourses());
    }
    //System.out.println(luis.toString());
}//class Main
