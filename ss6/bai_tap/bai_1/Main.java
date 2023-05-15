package ss6.bai_tap.bai_1;

public class Main {
    public static void main(String[] arg) {
        Circle circle = new Circle(5, "green");

        Cyclinder cyclinder = new Cyclinder(10, 5, "red");

        circle.setRadius(7);
        circle.setColor("yellow");

        cyclinder.setColor("blue");

        System.out.println(circle);

        System.out.println(cyclinder);


    }
}
