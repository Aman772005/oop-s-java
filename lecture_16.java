// *** Encaplutation *** 
public class lecture_16 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(200);
        ba.getbalance();

        System.out.println(ba.getbalance());

        Student s1 = new Student("Aman", 21, 353, "MIT-WPU");

        System.out.println(s1.getName());
        System.out.println(s1.getage());
        System.out.println(s1.getroll());
        System.out.println(s1.getcoll());
    }
}

class BankAccount {
   private double balance ; 

   public void deposit(int amount){
    balance += amount ;
   }

   public void withdraw(int amount){
    balance -= amount ;
   }

   public double getbalance(){
         return balance  ;
   }
}


class Student{
    private String name ;
    private int age ;
    private int rollnumber  ;
    private String coll ;

    Student(String name , int age , int rollnumber , String coll) {
        this.name = name ;
        this.age = age ;
        this.rollnumber = rollnumber;
        this.coll = coll ;
    }

    public String getName(){
        return name ;
    }

    public int getage(){
        return age ;
    }

    public int getroll(){
        return rollnumber ;
    }

    public String getcoll(){
        return coll ;
    }
}

