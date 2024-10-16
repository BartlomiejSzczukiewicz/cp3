public class Student {
    String name;
    int age;
    int idcard;
    boolean isvalidid;
    int semester;
    double average;

    void sayHello(){
        System.out.println("Hello from "+name);
    }
    void dispalyName(){
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);
    }

    void introduce(){
        System.out.println(name + " " + semester + " " + isvalidid + " " + average);
    }
    void changeStatus(){
        if(isvalidid) {
            isvalidid = false;
        }
        isvalidid = true;
    }
    void studentInfo(){
        System.out.println(name + " " + isvalidid + " " + idcard);
    }
}