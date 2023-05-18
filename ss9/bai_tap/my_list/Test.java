package ss9.bai_tap.my_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList<Integer>();

        myList.add(0, 0);
        myList.add(1, 1);
        myList.add(2, 2);
        myList.add(3, 3);
        myList.add(4, 4);
        myList.add(5, 5);
        myList.add(6, 6);
        myList.add(7, 7);
        myList.add(8, 8);
        myList.add(9, 9);
        myList.add(10, 10);
        myList.add(11, 11);
        myList.add(12, 12);

        myList.add(5, 100);

        System.out.println(myList.contains(3));
        System.out.println(myList.indexOf(3));
        System.out.println(myList.add(3));


        for (int i = 0; i < myList.clone().length; i++) {
            if (myList.clone()[i] != null) {
                System.out.println("phần tử có vị trí " + i + " có giá trị là: " + myList.clone()[i]);
            }
        }
    }
}
