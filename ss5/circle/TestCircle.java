package ss5.circle;

import javax.jws.soap.SOAPBinding;

public class TestCircle {
    public static void main(String[] args) {
        Circle circleFirst = new Circle();
        Circle circleSecond = new Circle(5);

        System.out.println(circleFirst.toString());
        System.out.println(circleSecond.toString());

    }

}
