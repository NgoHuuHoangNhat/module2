package ss13.bai_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        if (length > 0) {
            int[] arr = new int[length];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Nhập phần tử thứ " + i + ": ");
                arr[i] = Integer.parseInt(scanner.nextLine());

            }
            InsertionSort insertionSort = new InsertionSort();

            System.out.println("Mảng sau khi được sắp xếp: " + Arrays.toString(insertionSort.insertionSort(arr)));
        } else {
            System.out.println("Mảng phải có độ dài lớn hơn 0!");
        }

    }
}
