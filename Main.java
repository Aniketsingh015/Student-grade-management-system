public class Main{
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Student s1=new Student(101, "Aniket", 80, 90, 100);
        Student s2=new Student(102, "Kanika", 80, 90, 100);
        Student s3=new Student(103, "Kanika", 80, 90, 100);
       

        // see what happens after we set the value from constructor then lets see if we set value independently then
        
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        
        manager.displayAllStudents();

        manager.removeStudent(101);
        
    }
}