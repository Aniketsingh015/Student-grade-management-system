import java.util.HashMap;
import java.util.Map;
public class StudentManager {
    private final Map<Integer,Student>students=new HashMap<>();

    public void addStudent(Student student){//student student here means reference to existing object
        int id=student.getStudentId();
        if(students.containsKey(id)){
            throw new IllegalArgumentException("Studentt id exists");
        }
        students.put(id,student);
    }

    // to find id ---student return type becuase map store a student
    public Student findById(int id){
        Student student =students.get(id);
        if(student==null){
            throw new IllegalArgumentException("Student not found");
        }
        
        return student;


    }

    // Now imagine our system has 100 students.The user wants to display every student’s details.
    public void displayAllStudents(){
        if(students.isEmpty()){
            System.out.println("no student available");
            return;
        }
    for(Student student:students.values()){
        student.displayStudentdetails();
    }
}

// Suppose a student leaves the institution, and the administrator wants to remove that student using their ID.

    public void removeStudent(int id){
        if(!students.containsKey(id)){
            throw new IllegalArgumentException("Student ID " + id + " not found");
        
        }
        students.remove(id);
        System.out.println("Student with ID " + id + " removed successfully");
    }


}
