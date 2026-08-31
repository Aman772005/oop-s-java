// public class lecture_19 {
//     public static void main(String[] args) {
//         // Outer outer = new Outer();
//         // Outer.Inner inner = new Outer.Inner(outer);
//         // inner.fun();
//     } 
// }

// // class Outer{

// //     static int x = 4 ;
// //     int y;

// //     static class Inner{

// //         Outer outer ;

// //         Inner(Outer outer){
// //             this.outer = outer;
// //         }
// //         void fun(){
// //             System.out.println("hello");
// //             System.out.println(outer.y);
// //         }
// //     }
// // }

// class BankAccount{

//     private static class InterestCalculator{
//         static double calculateYearly(double principal , double rate){
//             return principal * rate ;
//     }

//     public double computeIntrsest (double principal) {
//         return InterestCalculator.calculateYearly(principal,0.09)
//         }
//     }
// }

// public class lecture_19 {

//     public static void main(String[] args) {
//         // outer o1 = new outer();

//         // outer.inner i1 = o1.new inner();
        

//         outer.inner i1 = new outer().new inner();

//         i1.fun();
//         i1.fun2();
//         outer.inner.fun2();
//     }
// }

// class outer{
//     int x = 10 ;
//     class inner{
//         int x = 20 ;
//         void fun(){
//             System.out.println(x);
//             System.out.println(outer.this.x);
//         }
//         static void fun2(){
//             System.out.println("hello");
//         }
//     }
// }


// local class
// public class lecture_19{
//     public static void main(String[] args) {
//         outer o1 = new outer();
//         o1.greeet();
//     }
// }

// class outer{
//     void greeet(){
//         class local {
//             void sayhello(){
//                 System.out.println("hello");
//             }
//         }
//         local l1 = new local();
//         l1.sayhello();
//     }
// }

public class lecture_19{
    public static void main(String[] args) {
        // person p1 = new person();
        // p1.intro();

        person p2 = new person(){
            void intro(){
                System.out.println("i am a guest");
                name();
            }
            void name(){
                System.out.println("aman");
            }
        };
        p2.intro();
    }
}

class person{
    void intro(){
        System.out.println("hii i am person");
    }
}