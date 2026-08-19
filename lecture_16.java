// // *** Encaplutation *** 
// public class lecture_16 {
//     public static void main(String[] args) {
//         BankAccount ba = new BankAccount();
//         ba.deposit(500);
//         ba.withdraw(200);
//         ba.getbalance();

//         System.out.println(ba.getbalance());

//         Student s1 = new Student("Aman", 21, 353, "MIT-WPU");

//         System.out.println(s1.getName());
//         System.out.println(s1.getage());
//         System.out.println(s1.getroll());
//         System.out.println(s1.getcoll());
//     }
// }

// class BankAccount {
//    private double balance ; 

//    public void deposit(int amount){
//     balance += amount ;
//    }

//    public void withdraw(int amount){
//     balance -= amount ;
//    }

//    public double getbalance(){
//          return balance  ;
//    }
// }


// class Student{
//     private String name ;
//     private int age ;
//     private int rollnumber  ;
//     private String coll ;

//     Student(String name , int age , int rollnumber , String coll) {
//         this.name = name ;
//         this.age = age ;
//         this.rollnumber = rollnumber;
//         this.coll = coll ;
//     }

//     public String getName(){
//         return name ;
//     }

//     public int getage(){
//         return age ;
//     }

//     public int getroll(){
//         return rollnumber ;
//     }

//     public String getcoll(){
//         return coll ;
//     }
// }

// ***** Inheritance ***** 

// *** Simple Inheritance *** 

// public class lecture_16{
//     public static void main(String[] args){
//         EngineeringStudent en = new EngineeringStudent();
        
//         // en.markAttendance();
//         // en.attendLAb();

//         Student s1 = new Student();
//         s1.markAttendance();
//         // s1.attendLab(); (wrong)
//     }
// }

// class Student{
//     String name ;
//     int age ;

//     void markAttendance(){
//         System.out.println("Attendance marked");
//     }
// }

// class EngineeringStudent extends Student{
//     void attendLAb(){
//         System.out.println("Lab attended");
//     }
// }


// ***** Types of inhertitance ****** 

// Simple inhertitance 
// Multi-Level inhertance
// Hierarchical inhertance
// Multiple inhertance 




// *** Multi-Level inhertance *** 

// public class lecture_16{
//     public static void main(String[] args){
//         EngineeringStudent en = new EngineeringStudent();
        
//         // en.markAttendance();
//         // en.attendLAb();

//         Student s1 = new Student();
//         // s1.markAttendance();
//         // s1.attendLab(); (wrong)

//         CSEngineeringStudent CSen = new CSEngineeringStudent();

//         CSen.markAttendance();
//         CSen.miniproject();
//     }
// }

// class Student{
//     String name ;
//     int age ;

//     void markAttendance(){
//         System.out.println("Attendance marked");
//     }
// }

// class EngineeringStudent extends Student{
//     void attendLAb(){
//         System.out.println("Lab attended");
//     }
// }

// class CSEngineeringStudent extends EngineeringStudent{
//     void miniproject(){
//         System.out.println("submitted");
//     }
// }

// *** hierarchical inhertance ***

// public class lecture_16{
//     public static void main(String[] args){
//         EngineeringStudent en = new EngineeringStudent();
//         MedicalStudents ms = new MedicalStudents();

//         ms.markAttendance();
//         en.markAttendance();
//         ms.attendedLab();
//         en.attendLAb();

//         Student s1 = new Student();
//         // s1.markAttendance();
//         // s1.attendLab(); (wrong)
//     }
// }

// class Student{
//     String name ;
//     int age ;

//     void markAttendance(){
//         System.out.println("Attendance marked");
//     }
// }

// class EngineeringStudent extends Student{
//     void attendLAb(){
//         System.out.println("Lab Attended");
//     }
// }

// class MedicalStudents extends Student{
//     void attendedLab(){
//         System.out.println("Lab Attended");
//     }
// }


// ***** Super Keyword ***** 

public class lecture_16{
    public static void main(String[] args) {
       EngineeringStudent en = new EngineeringStudent("aman",21, 353 , "MIT-WPU");
       en.print();
    }
}

class Student{
    String name ;
    int age ;
    int rollnumber;

    Student(String name , int age , int rollnumber){
        this.name = name ;
        this.age = age ;
        this.rollnumber = rollnumber;
    }
    void print(){
        System.out.println(name + " , " + age + " , " + rollnumber);
    }
    }
    

class EngineeringStudent extends Student{
    String collage ;

    EngineeringStudent(String name , int age , int rollnumber , String collage ){
        super(name, age, rollnumber);
        this.collage = collage ;
    }

    void print(){
        super.print();
        System.out.println(collage);
    }
}