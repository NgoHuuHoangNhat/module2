package ss6.demo;

public class Main {
    public static void main(String[] args) {
        Animal sam = new Animal();
        Dog milu = new Dog();

        Animal cung = new Dog();
        milu = (Dog)cung ;

        System.out.println(((Dog)cung).giongLoai);


        float a = 5;

        System.out.println((int) a/3);
    }
}
