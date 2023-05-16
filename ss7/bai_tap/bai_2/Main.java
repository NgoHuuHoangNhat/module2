package ss7.bai_tap.bai_2;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);

        Shape[] arr = new Shape[3];
        arr[0] = new Circle("green", true, 5);
        arr[1] = new Retangle(5, 10);
        arr[2] = new Square(10);


        for (Shape e : arr) {
            if (e instanceof Colorable) {
                System.out.println("diện tích " + e.getName() + ": " + e.getArea());
                ((Colorable) e).howToColor();
            } else {
                System.out.println("diện tích " + e.getName() + ": " + e.getArea());
            }
        }
    }
}
