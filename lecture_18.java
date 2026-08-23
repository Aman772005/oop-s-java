public class lecture_18 {
    public static void main(String[] args) {

        Animal a = new Dog("sweety");
        a.makesound();
        // Autoboxing 

        // int x = 10 ;
        // Integer y = x ;

        // System.out.println(x);
        // System.out.println(y);

        // // Unboxing
        
        // Integer a = 20 ;
        // int b = a ;

        // System.out.println(a);
        // System.out.println(b);
      

        // int x = 100 ;
        // int y = 100 ;

        // System.out.println(x == y);

        // Integer a = 200 ;
        // Integer b = 200 ;

        // System.out.println(a == b);
        // System.out.println(a.intValue() == b.intValue());



    }
}

abstract class Animal {


    String name ;

    Animal (String name){
        this.name = name ;
    }

    abstract void makesound();

    void sleep(){
        System.out.println("Sleeping");
    }

}

    class Dog extends Animal {


        Dog(String name){
            super(name);
        }

        void makesound(){
            System.out.println("Making barking sound");
        }
    }
