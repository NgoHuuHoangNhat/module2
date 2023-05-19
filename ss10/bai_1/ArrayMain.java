package ss10.bai_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reverse reverse = new Reverse();

        System.out.print("nhập số lượng phần tử trong mảng: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập số nguyên thứ " + i + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("mảng số nguyên sau khi đảo ngược là: " + Arrays.toString(reverse.reverseArr(arr)));
    }
}
