public class Student {
    // data
    private int StudentId;
    private String Name;
    private int mathematicsMarks;
    private int physicsMarks;
    private int chemistryMarks;

    // getters & setters

    public void setStudentId(int StudentId){
        this.StudentId=StudentId;
    }
    public int getStudentId(){
        return this.StudentId;
    }

    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return this.Name;
    }

    public void setMathematicsMarks(int mathematicsMarks){
        this.mathematicsMarks=mathematicsMarks;
    }
    public int getMathematicsMarks(){
        return this.mathematicsMarks;
    }

    public void setphysicsMarks(int physicsMarks){
        this.physicsMarks=physicsMarks;
    }
    public int getphysicsMarks(){
        return this.physicsMarks;
    }


    public void setchemistryMarks(int chemistryMarks){
        this.chemistryMarks=chemistryMarks;
    }
    public int getchemistryMarks(){
        return this.chemistryMarks;
    }

    // constructor
    public Student(int StudentId,String Name,int mathematicsMarks,int physicsMarks,int chemistryMarks){
        this.StudentId=StudentId;
        this.Name=Name;
        this.mathematicsMarks=mathematicsMarks;
        this.physicsMarks=physicsMarks;
        this.chemistryMarks=chemistryMarks;
    }

    // methods-
    // 1. Calculate total marks.
    public void totalMarks(int mathematicsMarks,int physicsMarks,int chemistryMarks){
        System.out.println("Total Marks"+":"+(mathematicsMarks+physicsMarks+chemistryMarks));
    }
    // 2. Calculate average marks.
    public void averageMarks(int mathematicsMarks,int physicsMarks,int chemistryMarks){
        System.out.println("Average Marks"+":"+(mathematicsMarks+physicsMarks+chemistryMarks)/3);
    }
    // 3. Display student details and results.
    public void Studentdetails(int StudentId,String Name,int mathematicsMarks,int physicsMarks,int chemistryMarks){
       System.out.println("======Student Details======");
        System.out.println("Student Id:"+getStudentId());
        System.out.println("Name:"+getName());
        System.out.println();
        System.out.println("===== Academic Results =====");
        System.out.println("Mathematics"+getMathematicsMarks());
        System.out.println("Physics"+getphysicsMarks());
        System.out.println("Chemistry"+getchemistryMarks());

    }


}
