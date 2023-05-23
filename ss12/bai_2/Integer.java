package ss12.bai_2;

import java.util.Arrays;

public class Integer {
    public void showIndex(int[] arr, int num) {

        int first = 0;
        int last = arr.length - 1;
        System.out.println("Số bạn đang nhập thuộc vị trí thứ: " + getIndex(arr, first, last, num));

    }

    public int getIndex(int[] arr, int first, int last, int num) {

        int mid = (first + last) / 2;
        if (first > last) {
            return -1;
        }
        if (num == arr[mid]) {
            return mid;
        } else if (num < arr[mid]) {
            last = mid - 1;
        } else {
            first = mid + 1;
        }
        return getIndex(arr, first, last, num);

    }
}
