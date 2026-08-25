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

public class lecture_19 {

    public static void main(String[] args) {
        // outer o1 = new outer();

        // outer.inner i1 = o1.new inner();
        

        outer.inner i1 = new outer().new inner();

        i1.fun();
    }
}

class outer{
    class inner{
        void fun(){
            System.out.println("hello");
        }
    }
}