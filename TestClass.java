public class TestClass {

    public Student getPassedStudent(Student s){
        if (s.getMarks()>= 36) {
            return s;
        }
        else {
           return null;
        }
    }
    public static void main(String[]args){
        Student stud1=new Student("durga",92,101);
        Student stud2=new Student("bindu",30,102);

        TestClass test=new TestClass();
        Student s1validcheck=test.getPassedStudent(stud1);
        Student s2validcheck=test.getPassedStudent(stud2);

        if(s1validcheck!=null){
            System.out.println(s1validcheck.getMarks());
        }
        if(s2validcheck!=null){
            System.out.println(s2validcheck.getMarks());
        }

    }
}
