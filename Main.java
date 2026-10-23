public class Main{
    public static void main(String[] args) {
        Student s1=new Student(101, "Aniket", 80, 90, 100);
        s1.displayStudentdetails();

        // see what happens after we set the value from constructor then lets see if we set value independently then
        try {
            s1.setMathematicsMarks(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("error:"+e.getMessage());
        }



System.out.println(s1.getMathematicsMarks());

        
    }
}