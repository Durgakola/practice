public class ForLooptest {

    public static void main(String[] args){

        for(int i=0;i<200000000;i++){
            Student s=new Student("ram",60,102);
            System.out.println(i);
        }
    }
}
