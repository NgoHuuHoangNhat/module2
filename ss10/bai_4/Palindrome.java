package ss10.bai_4;

import java.util.*;

public class Palindrome {
    /**
     * @author: Ngô Hữu Hoàng Nhật.
     * @param: tham số str có kiểu dữ liệu là String.
     * @return: trả về true nếu là chuỗi Palindrome, ngược lại trả về false.
     */
    public boolean testStr(String str) {

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        String[] arr = str.split("");

        for (String e : arr) {
            stack.add(e);
            queue.add(e);
        }

        int temp = stack.size();

        for (int i = 0; i < temp; i++) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }

        return true;
    }
}
