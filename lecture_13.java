// Constructors
public class lecture_13 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("thakur");
        Student s3 = new Student("aditya",21);
        Student s4 = new Student("Sachin",21,354);
        Student s5 = new Student("Aman",21,353,"MIT");

        s1.print();
        s2.print();
        s3.print();
        s4.print();
        s5.print();

        s1.markAttendance();
        s2.markAttendance();
    }
}


class Student{
    String name;
    int age;
    int rollNumber;
    String collage;

    // ***** call to direct all values taking constructor ***** 

    // Student(String name , int age , int rollNumber , String collage){
    //         this.name = name;
    //         this.age = age ;
    //         this.rollNumber = rollNumber ;
    //         this.collage = collage;
    //         System.out.println("fifth");
    //     }

    // Student(String name , int age , int rollNumber){
    //     this(name,age,rollNumber,null);
    //     System.out.println("fourth");
    // }

    // Student(String name , int age ){
    //     this(name,age,0,null);
    //     System.out.println("third");
    // }

    //  Student(String name ){
    //     this(name,0,0,null);
    //     System.out.println("Second");
    // }

    // Student(){
    //   System.out.println("first");
    // }


    // ***** from one by one chaning ***** 

    Student(){
        this("null");
        System.out.println("first");
    }

     Student(String name ){
        this(name,0);
        System.out.println("Second");
    }

    Student(String name , int age ){
        this(name,age,0);
        System.out.println("third");
    }

    Student(String name , int age , int rollNumber){
        this(name,age,rollNumber,null);
        System.out.println("fourth");
    }

     Student(String name , int age , int rollNumber , String collage){
            this.name = name;
            this.age = age ;
            this.rollNumber = rollNumber ;
            this.collage = collage;
            System.out.println("fifth");
        }


    void print(){
        System.out.println(name+" "+age+" "+rollNumber+" "+collage);
    }

    void markAttendance(){
        System.out.println("Attendance marked by " + name);
    }
}