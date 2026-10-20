public class Student {
    // data
    private int studentId;
    private String name;
    private int mathematicsMarks;
    private int physicsMarks;
    private int chemistryMarks;

    // getters & setters

    public void setStudentId(int studentId){
        if(studentId<1){
            throw new IllegalArgumentException("id is not valid");
        }
        this.studentId=studentId;
    }
    public int getStudentId(){
        return this.studentId;
    }

    public void setName(String name){
        if(name==null||name.isBlank())throw new IllegalArgumentException("name is null");
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setMathematicsMarks(int mathematicsMarks){
        if(mathematicsMarks<0 || mathematicsMarks>100){
            throw new IllegalArgumentException("the marks is invalid re-enter");
        }
        this.mathematicsMarks=mathematicsMarks;
    }
    public int getMathematicsMarks(){
        return this.mathematicsMarks;
    }

    public void setphysicsMarks(int physicsMarks){
        if(physicsMarks<0 || physicsMarks>100){
            throw new IllegalArgumentException("the marks is invalid re-enter");
        }
        this.physicsMarks=physicsMarks;
    }
    public int getphysicsMarks(){
        return this.physicsMarks;
    }


    public void setchemistryMarks(int chemistryMarks){
        if(chemistryMarks<0 || chemistryMarks>100){
            throw new IllegalArgumentException("the marks is invalid re-enter");
        }
        this.chemistryMarks=chemistryMarks;
    }
    public int getchemistryMarks(){
        return this.chemistryMarks;
    }

    // constructor
    public Student(int studentId,String name,int mathematicsMarks,int physicsMarks,int chemistryMarks){

        // validations for marks
        if(mathematicsMarks<0 || mathematicsMarks>100){
            throw new IllegalArgumentException("the marks is invalid re-enter");
        }
        if(physicsMarks<0 || physicsMarks>100){
            throw new IllegalArgumentException("the marks is invalid re-enter");
        }
        if(chemistryMarks<0 || chemistryMarks>100){
            throw new IllegalArgumentException("the marks is invalid re-enter");
        }

        // validation for student id
        if(studentId<1){
            throw new IllegalArgumentException("id is not valid");
        }

        // validate name
        if(name==null||name.isBlank())throw new IllegalArgumentException("name is null");

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
