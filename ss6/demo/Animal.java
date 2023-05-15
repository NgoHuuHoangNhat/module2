package ss6.demo;

public class Animal {
    String name;
    String color;
    int age;


    Animal(){
        this.name = null;
        this.color = "black";
        this.age = 1;
    }

    public void eat(){
        System.out.println("măm măm");
    }
    public void drink(){
        System.out.println("ực ực");
    }
    public void sleep(){
        System.out.println("khò khò");
    }
}
