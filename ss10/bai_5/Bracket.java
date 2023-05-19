package ss10.bai_5;

import java.util.Stack;

public class Bracket {

    /**
     * @author: Ngô Hữu Hoàng Nhật.
     * -----------------------------
     * @param: testBracket: phương thức kiểm tra dấu ngoặc có được sử dụng đúng hay không!
     * <p>
     * b1: chuyển chuỗi thành mảng kí tự.
     * b2: duyệt mảng
     * nếu phần tử bằng "(", đưa vào stack
     * nếu phần tử bằng ")", kiểm tra stack, stack rỗng thì trả về false, stack có phần tử thì xoá phần tử cuối cùng.
     * b3: sau khi duyệt xong mảng, kiểm tra stack, stack có phần tử thì trả về false.
     * b4: nếu không gặp những trường hợp trên thì trả về true.
     */

    public boolean testBracket(String str) {

        Stack<String> stack = new Stack<>();

        String[] arr = str.split("");

        for (String e : arr) {
            if (e.equals("(")) {
                stack.add(e);
            }
            if (e.equals(")")) {
                if (stack.size() == 0) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.size() > 0) {
            return false;
        }

        return true;
    }
}
