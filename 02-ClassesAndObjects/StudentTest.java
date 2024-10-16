public class StudentTest {
    public static void main(String[] args) {

        Student s = new Student();
        Student s2 = new Student();

        s.name = "John";
        s.age = 23;
        s.isvalidid = true;
        s.idcard = 2312312;
        s.semester = 3;
        s.average = 2.31;

        s2.name = "Will";
        s2.age = 19;
        s2.isvalidid = false;
        s2.idcard = 8768678;
        s2.semester = 1;
        s2.average = 4.88;

        
        System.out.println(s.name + ", " + s.age);

        s.sayHello();
        s.dispalyName();
        s.displayAge();
        s.introduce();
        s.changeStatus();
        s.studentInfo();

        s2.sayHello();
        s2.dispalyName();
        s2.displayAge();
        s2.introduce();
        s2.changeStatus();
        s2.studentInfo();

    }   
}