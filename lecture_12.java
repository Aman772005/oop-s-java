// OOPS in Java 
// Classes , Objects , new Keyword 
public class lecture_12 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aman";
        s1.age = 21;
        s1.rollNumber = 353;
        s1.collage = "WPU";

        s1.name = "man";
        s1.age = 21;
        s1.rollNumber = 333;
        s1.collage = "WPU";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String collage;

    void markAttendance(){
        System.out.println("Attendance marked by " + name);
    }

    void print(){
        System.out.println(name +" , "+age +" , "+rollNumber +" , "+collage +" , ");
    }
}
