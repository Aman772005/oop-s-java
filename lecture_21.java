public class lecture_21{
    public static void main(String[] args) {
        Collage collage = new Collage("IIT G","Pune");
        Student s = new Student(21,"Aman",collage);

        System.out.println(s.getCollage().name);
        s.getCollage().name = "IIT B";
        System.out.println(s.getCollage().name);
    }
}

// immutable class
final class Student{
    private final int age;
    private final String name;
    private final Collage collage;

    Student(int age, String name,Collage collage){
        this.age = age ;
        this.name = name ;

        // Defensive copy
        this.collage = new Collage(collage.name , collage.address);
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name ;
    }

    public Collage getCollage(){
        return new Collage(this.collage.name , this.collage.address);
    }
}

class Collage{
    String name ;
    String address;

    Collage(String name , String address){
        this.name = name ;
        this.address = address ;
    }
}

