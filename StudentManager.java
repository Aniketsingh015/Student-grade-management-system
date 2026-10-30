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

    public Student findById(int id){
        Student student =students.get(id);
        if(student==null){
            throw new IllegalArgumentException("Student not found");
        }
        System.out.println("student exist");
        return student;


    }
}
