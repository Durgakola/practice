public class Student {
    private String name;
    private int marks;
    private int rollNo;

    public Student(String name,int marks,int rollNo){
        this.name=name;
        this.marks=marks;
        this.rollNo=rollNo;
    }
    public int getMarks(){

        return this.marks;
    }
}
