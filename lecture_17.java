// public class lecture_17 {
//      public static void main(String[] args) {

//         car car = new ElectricCar();

//         car.start();
//         car.accelerate();
//         car.brake();

//         car car1 = new Fulecar();

//         car1.start();
//         car1.accelerate();
//         car1.brake();
        
//      }
// }

// abstract class car{
//     void start(){
//         System.out.println("Car Started");
//     }

//     abstract void accelerate();

//     abstract void brake();
// }


// class Fulecar extends car{
//     @Override
//     void accelerate(){
//         System.out.println("Fule Car is accelerating");
//     }
//     @Override
//     void brake(){
//         System.out.println("Fule Car is stoping");
//     }
// }

// class ElectricCar extends car{
//     @Override
//     void accelerate(){
//         System.out.println("electric car is accelerating");
//     }
//     @Override
//     void brake(){
//         System.out.println("electric Car is stoping");
//     }
// }

// public class lecture_17 {

//     public static void main(String[] args) {
//         Car car = new ElectricCar();

//         car.start();
//         car.accelerate();
//         car.brake();

//         Car car1 = new FuleCar();

//         car1.start();
//         car1.accelerate();
//         car1.brake();
//     }
// }

// interface Car{
//     void start();

//     void accelerate();

//     void brake();

// }

// class ElectricCar implements Car{
//     @Override
//     public void start(){
//         System.out.println("Electric car has started");
//     }
//     @Override
//     public void accelerate(){
//         System.out.println("Electric car has accletreating");
//     }
//     @Override
//     public void brake(){
//         System.out.println("Electric car is stoping");
//     }
// }


// class FuleCar implements Car{
//     @Override
//     public void start(){
//         System.out.println("Fule car has started");
//     }
//     @Override
//     public void accelerate(){
//         System.out.println("Fule car has accletreating");
//     }
//     @Override
//     public void brake(){
//         System.out.println("Fule car is stoping");
//     }
// }


public class lecture_17 {

    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        System.out.println(b.getX());
        // a.fun();
        System.out.println(a.getX());
    }
}

// class A {
//     static void fun(){
//         System.out.println("Hello");
//     }

//     final void fun3(){
//         System.out.println("hello");
//     }
// }

// class B extends A{
//     static void fun(){
//         System.out.println("Buy");
//     }

//     // void fun3(){
//     //     System.out.println("byy");
//     // }
// }

// class A{
//     int x = 10;
// }

// class B extends A{
//     int x = 20;
// }

class A{
    int getX(){
        return 10 ;
    }
}

class B extends A{
    int getX(){
        return 20 ;
    }
}
