public class lecture_17 {
     public static void main(String[] args) {

        car car = new ElectricCar();

        car.start();
        car.accelerate();
        car.brake();

        car car1 = new Fulecar();

        car1.start();
        car1.accelerate();
        car1.brake();
        
     }
}

abstract class car{
    void start(){
        System.out.println("Car Started");
    }

    abstract void accelerate();

    abstract void brake();
}


class Fulecar extends car{
    @Override
    void accelerate(){
        System.out.println("Fule Car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Fule Car is stoping");
    }
}

class ElectricCar extends car{
    @Override
    void accelerate(){
        System.out.println("electric car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("electric Car is stoping");
    }
}