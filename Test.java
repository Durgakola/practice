public class Test {
    public Student getpassedstudent(Student s1){
        if(s1.getMarks()>35){
            return s1;
        }
        else{
            return null;
        }
    }
    public static void main(String[] args){
        Student a1=new Student("sai",22,107);
        Student a2=new Student("ram",55,108);
        Test T=new Test();
        Student ss=T.getpassedstudent(a1);
        if(ss!=null){
            System.out.println(ss.getMarks());
        }
        Student sss=T.getpassedstudent(a2);
        if(sss!=null){
            System.out.println(sss.getMarks());
        }
        Student a3=a1;
        Student a4=a2;
        if(a1==a3){
            System.out.println("a1 and a3 are equal");
        }
        else{
            System.out.println("a1 and a3 are not equal");
        }
        if (a2==a4){
            System.out.println("a2 and a4 are equal");
        }
        else{
            System.out.println("a2 and a4 are not equal");
        }
        if(a1==a2){
            System.out.println("a1 and a2 are equal");
        }
        else{
            System.out.println("a1 and a2 are not equal");
        }
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
        System.out.println(a4.hashCode());
    }
}
