package ss13.bai_2;

import java.util.Collections;
import java.util.Comparator;

public class InsertionSort {
    public int[] insertionSort(int[] list) {
        /**
         @author: Ngô Hữu Hoàng Nhật
         @param: Phương thức insertionSort cho phép sắp xếp mảng list theo thứ tự tăng dần
         @param: Khai báo biến element đại diện cho phần tử.
         @param: Khai báo biến pos đại diện cho vị trí của phần tử element
         */
        int element;
        int pos;

        /**
         @param: Thực hiện chạy 2 vòng lặp
            + Vòng lặp ngoài là for-loop thực hiện gán giá trị cho element và pos
            + Vòng lặp trong là while-loop thực hiện gán giá trị của phần tử trc cho phần tử sau nếu thoả mãn điều kiện lặp
            + Kết thúc vòng lặp while thì sẽ gán giá trị của phần tử elemnt cho vị trí thích hợp của nó
         */
        for (int i = 1; i < list.length; i++) {
            element = list[i];// gán giá trị của phần tử ở vị trí i cho element
            pos = i;// gán vị trí i cho pos

            //Vòng lặp while thực hiện kiểm tra điều kiện, nếu thoả mãn thì thực hiện khối lệnh
            while (pos > 0 && element < list[pos - 1]) {
                list[pos] = list[pos - 1];// gán giá trị của phần tử trước cho phần tử sau kế nó
                pos--;// giảm 1 đơn vị cho pos
            }
            list[pos] = element;// thực hiện gán giá trị của element cho phần tử thích hợp
        }
        return list;// trả về mảng mới đã được sắp xếp

    }
}
