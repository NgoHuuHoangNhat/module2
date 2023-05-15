package ss6.thuc_hanh.bai_1;

public class Test {
    public static void main(String[] args) {
//        Circle circle = new Circle("red", 10, false);
//        Retangle retangle = new Retangle();
//
//        int a = 9;
//        String b = "ghdhg";
//
//
//        System.out.println(circle.getInfor());
//        System.out.println(retangle.getInfor());

        // byte->short->int->long->float->double

        //ngầm định
//        int a = 5;
//        float b = (float) a;
//
//
//        System.out.println(a/2);
//        System.out.println(b/2);


        //tường minh
//        float c = 5.536f;
//        short d = (short) c;
//
//        System.out.println(d);


        //kiểu dữ liệu tham chiếu

        //dựa vào mỗi quan hệ giữa các class

        //Shape là class cha, Circle và Retangle là class con của Shape


//        Shape shape = new Shape();

//        Circle circle = new Circle();


        //ngầm định

//        a = (Shape) circle;


        //tường minh

//        b = (Circle)shape;

        Shape shape = new Shape();
        Shape shape1 = new Circle();
        Circle circle = new Circle();

        circle = (Circle)shape1;



    }
}
