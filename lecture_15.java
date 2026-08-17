// // static keyword 
// public class lecture_15 {
//     public static void main(String[] args) {
//         Student s1 = new Student("Aman", 21, 1272260353);
//         Student s2 = new Student("Aditya", 21, 1272260);

//         // Student.collage = "MIT-WPU" ;

//         System.out.println(s1.name+ s1.age + s1.rollnumber + Student.collage);
//         System.out.println(s2.name+ s2.age + s2.rollnumber + Student.collage);
//     }
// }

// class Student{
//     String name ;
//     int age;
//     int rollnumber;
//     static String collage = "MIT-WPU";

//     Student(String name , int age , int rollnumber){
//         this.name = name ;
//         this.age = age;
//         this.rollnumber = rollnumber ;
//     }

//     static{
//         // collage = "MIT-WPU" ;
//     }

// }


// *** Final ***

public class lecture_15 {

    public static void main(String[] args) {

        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x ;
        x = 4;
        System.out.println(x);

    }
}

class Random {

    final double PI ;

    Random(){
        this.PI = 3.14 ;
    }
}

