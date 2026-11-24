import java.util.*;
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


    public void updateStudentsMarks(int id,String subject,int marks){
        Student student=findById(id);
        if(subject.equalsIgnoreCase ("mathematics")){
            student.setMathematicsMarks(marks);
        }else if(subject.equalsIgnoreCase ("physics")){
            student.setPhysicsMarks(marks);
        }else if(subject.equalsIgnoreCase("chemistry")){
            student.setChemistryMarks(marks);
        }else{
            throw new IllegalArgumentException("Invalid subject");
        }
    }


    // Requirement 7: Search and Display a Student by ID
    public void searchAndDisplay(int id){
        Student student=findById(id);
        student.displayStudentdetails();
    }


    //Requirement 8: We want to identify the student who has the highest total marks.

    public Student topperStudent(){
        int highestMarks=-1;
        Student topper=null;
        for(Student student:students.values()){
            int total=student.calculateTotalMarks();

            if(total>highestMarks){
                highestMarks=total;
                topper=student;
            }

        }
        return topper;
    }

    // Requirement 9: Find the student with the lowest marks

    public Student lowStudent(){
        int lowest=Integer.MAX_VALUE;
        Student markLowest=null;

        for(Student student:students.values()){
            int total=student.calculateTotalMarks();

            if(total<lowest){
                lowest=total;
                markLowest=student;
            }
        }
        return markLowest;

    } 

    // 10 requirement: Find all students scoring above 80%
    // as we have to return many studnets we will implemetn list to return them 

    public List<Student> findStudentsAbove80(){
        List<Student>result=new ArrayList<>();
        for(Student student : students.values()){
            double avg=student.calculateAverageMarks();

            if(avg>80){
                result.add(student);
            }
        }
        return result;
    }

    // 11.requirement: Find students by grade-Suppose we want to find every student who received grade A.
    public List<Student> findByGrade(String requiredGrade){
        List<Student>result=new ArrayList<>();
        for(Student student:students.values()){
            String grade=student.calculateGrade();

            if(grade.equalsIgnoreCase(requiredGrade)){
                result .add(student);
            }
        }
        return result;
    }


    // Requirement 12: Update a student’s name using Student ID
    public void updateStudentName(int id,String name){
        // can use the direct function of find by id which we have implemented 
        Student student=students.get(id);
        if(student==null){
            System.out.println("No student present by this id");
        }else{
            student.setName(name);
        }
    }

    // Requirement 13: Remove students based on their grade
    // for this there are 2methods keep in mind that whenever we are directly itterating over map we can retrieve the value but we cannot modify
    //any values in map we have different approach of that one to use itterator  , 2nd)use enhanced for loop keep the id in variable and after outside change it 

    public void removeStudentOnGrade(String requireGrade){
        Iterator<Student>iterator=students.values().iterator();
        while(iterator.hasNext()){
            Student student=iterator.next();

            if(student.calculateGrade().equalsIgnoreCase(requireGrade)){
                iterator.remove();
            }
        }

    }

    // Requirement 14: Count students by grade
    public void countByGrade(){
        Map<String, Integer> gradeCount = new HashMap<>();

        for(Student student:students.values()){
            String grade=student.calculateGrade();
            gradeCount.put(grade,gradeCount.getOrDefault(grade,0)+1);
        }
        for (Map.Entry<String, Integer> entry : gradeCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Requirement 15: Find the most common grade.
    public String mostCommonGrade(){
        Map<String,Integer>gradeCount=new HashMap<>();
        int maxValue=0;
        String maxGrade=null;
        for(Student student:students.values()){
            String grade=student.calculateGrade();
            gradeCount.put(grade,gradeCount.getOrDefault(grade, 0)+1);
        }
        for (Map.Entry<String, Integer> entry : gradeCount.entrySet()) {
            String grade = entry.getKey();
            int count = entry.getValue();
            if(count>maxValue){
                maxValue=count;
                maxGrade=grade;
            }
        }
        return maxGrade;
    }

    // Requirement 16 — Find student names by grade.
    public List<String>namesByGrade(String requiredGrade){
        ArrayList<String>result=new ArrayList<>();
        for(Student student:students.values()){
            String grade=student.calculateGrade();
            if(grade.equalsIgnoreCase(requiredGrade)){
                result.add(student.getName());
            }
        }
        return result;
    }

    // Requirement 17 — Search students by name
    public Student searchByName(String Name){
        for(Student student:students.values()){
            
            if(student.getName().equalsIgnoreCase(Name)){
                return student;
            }
        }
        return null;
        
    }

    // Requirement 18 — Count students whose average marks exceed a given threshold
    public int calculateUsingThreshold(double threshold){
        int count=0;
        for(Student student:students.values()){
            if(student.calculateAverageMarks()>=threshold){
                count=count+1;
            }
        }
        return count;
    }

    // Requirement 19 — Find the second-highest scorer
    public Student secondHighestScorer(){
        int first=Integer.MIN_VALUE;
        Student highestScorer=null;
        int second=Integer.MIN_VALUE;
        Student secondScorer=null;

        for(Student student:students.values()){
            int marks=student.calculateTotalMarks();
            if(marks>first){
                second=first;
                secondScorer=highestScorer;
                first=marks;
                highestScorer=student;
                
            }else if (marks>second && first>marks){
                second=marks;
                secondScorer=student;

            }

        

        }
        return secondScorer;
    }



}
