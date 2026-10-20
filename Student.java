public class Student {
    // data
    private int studentId;
    private String name;
    private int mathematicsMarks;
    private int physicsMarks;
    private int chemistryMarks;

    // getters & setters

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public int getStudentId(){
        return this.studentId;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
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
    public Student(int studentId,String name,int mathematicsMarks,int physicsMarks,int chemistryMarks){

        if(mathematicsMarks<0 || mathematicsMarks>100){
            throw new IllegalArgumentException("the marks is invalid re-enter");
        }

        // arguments-supplioed when object is initialized
        this.studentId=studentId;
        this.name=name;
        this.mathematicsMarks=mathematicsMarks;
        this.physicsMarks=physicsMarks;
        this.chemistryMarks=chemistryMarks;
    }

    // methods-
    // 1. Calculate total marks.
    public int calculateTotalMarks(){
        return mathematicsMarks+chemistryMarks+physicsMarks;
    }
    // 2. Calculate average marks.
    public double calculateAverageMarks(){
        return (mathematicsMarks+physicsMarks+chemistryMarks)/3.0;
    }
    // 3. Display student details and results.
    public void displayStudentdetails(){
       System.out.println("======Student Details======");
        System.out.println("Student Id:"+getStudentId());
        System.out.println("Name:"+getName());
        System.out.println();
        System.out.println("===== Academic Results =====");
        System.out.println("Mathematics: "+getMathematicsMarks());
        System.out.println("Physics: "+getphysicsMarks());
        System.out.println("Chemistry: "+getchemistryMarks());
        System.out.println();
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());

    }


}
