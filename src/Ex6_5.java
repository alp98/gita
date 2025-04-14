public class Ex6_5 {
    public static void main(String[] args) {
        Student s=new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}
class Student{
    String name;
        int ban;
                int no;
                int eng;
                int kor;
                int math;

    public Student(String name, int ban, int no, int eng, int kor, int math){
            this.name=name;
            this.ban=ban;
            this.no=no;
            this.eng=eng;
            this.kor=kor;
            this.math=math;


        }


    String info() {
        return "이름:" + name + "\n"
                + "반:" + ban + "\n"
                + "번호:" + no + "\n"
                + "영어:" + eng + "\n"
                + "국어:" + kor + "\n"
                + "수학:" + math + "\n";


    }
    }

