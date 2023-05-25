package ss10.bai_1;

import java.util.Stack;

public class Reverse {
    /**
     @Author: Ngô Hữu Hoàng Nhật.
     ----------------------------
     @param: reverseString: phương thức đảo ngược chuỗi kí tự.
     @param: reverseArr: phương thức đảo ngược mảng số nguyên.
     */

    /**
     * @param: reverseString: phương thức đảo ngược chuỗi kí tự.
     * @param: tham số str có kiểu dữ liệu là String.
     * @param: biến stack có kiểu dữ liệu là Stack.
     * @return: chuỗi sau khi đã được đảo ngược.
     */
    public String reverseString(String str) {

        Stack<String> wStack = new Stack<>();

        String[] mWorld = str.split("\\s+");

        for (int i = 0; i < mWorld.length; i++) {
            wStack.add(mWorld[i]);

        }

        str = "";
        int temp = wStack.size();

        for (int i = 0; i < temp; i++) {
            str += wStack.pop() + " ";
        }

        return str;





    }


    /**
     * @param: reverseArr: phương thức đảo ngược mảng số nguyên.
     * @param: tham số arr có kiểu dữ liệu là int[].
     * @param: biến stack có kiểu dữ liệu là Stack.
     * @return: mảng sau khi đã được đảo ngược.
     */
    public int[] reverseArr(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
