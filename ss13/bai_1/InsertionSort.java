package ss13.bai_1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        /**
         @author: Ngô Hữu Hoàng Nhật.
         @param: khai báo 1 mảng có tên arr để thực hiện kiểm tra
         */
        int[] arr = {5, 4, 7, 3, 1, 8};

        /**
         @param: khai báo biến tạm element.
         @paramL: khai bái biến tạm pos.
         */
        int element;
        int pos;

        /**
         @output: sử dụng 2 vòng lặp lồng nhau:
         + Vòng ngoài là for-loop, duyệt từ vị trí index 1 đến cuối mảng,
         gán vị trí index i cho pos, gán phần tử có vị trí index i cho biến element,
         sau đó thực hiện vòng lặp bên trong.
         + Vòng trong là while-loop, thực hiện so sánh giá trị của element với giá trị của phần tử có vị trí pos - 1,
         nếu thoả mãn điều kiện lặp thì gán giá trị của phần tử có vị trí pos - 1 cho phần tử ngay sau nó, pos giảm 1
         đơn vị.Lặp lại tuần tự các bước đến lúc không thoả mãn các điều kiện lặp.
         + Sau khi kết thúc vòng lặp while-loop thì phần tử tại vị trí pos được gán giá trị của biến element.
         + Bắt đầu lần lặp tiếp theo.
         */

        System.out.println("Mảng trước khi được sắp xếp: " + Arrays.toString(arr));
        //Vòng lặp ngoài chạy từ vị trí index 1 đến cuối mảng
        for (int i = 1; i < arr.length; i++) {
            //Gán giá trị cho biến element và pos
            element = arr[i];
            pos = i;

            //Vòng lặp while dùng để so sánh và thực hiện khối lệnh
            while (pos > 0 && element < arr[pos - 1]) {
                System.out.println("Phần tử tại vị trí " + pos + " trước khi thay đổi: " + arr[pos]);
                arr[pos] = arr[pos - 1]; // thực hiện gán giá trị của phần tử trc pos cho phần tử pos
                System.out.println("Phần tử tại vị trí " + pos + " sau khi thay đổi: " + arr[pos]);
                pos--; //thực hiên giảm pos đi 1
                System.out.println("Giá trị index của vị trí pos sau khi thay đổi: " + pos);
            }
            arr[pos] = element;//gán giá trị của element cho phần tử tại vị trí pos
            System.out.println("Vị trí mới của phần tử có giá trị là: " + element + " sau khi sắp xếp: " + pos);
        }
        System.out.println(Arrays.toString(arr));//hiển thị mảng sau khi sắp xếp
    }
}
