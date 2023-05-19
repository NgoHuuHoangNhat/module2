package ss10.bai_3;

import java.util.Stack;

public class Binary {
    /**
     * @author: Ngô Hữu Hoàng Nhật.
     * @param: tham số decimal(số thập phân) có kiểu dữ liệu int.
     * @return chuỗi str sau khi chuyển đổi từ số thập phân sang nhị phân.
     */
    public String switchToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

        String str = "";

        do {
            int binary = decimal % 2;
            stack.add(binary);
            decimal /= 2;
        } while (decimal > 0);

        int temp = stack.size();

        for (int i = 0; i < temp; i++) {
            str += stack.pop();
        }

        return str;
    }

}