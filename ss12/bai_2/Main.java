package ss12.bai_2;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 6, 8, 9, 10, 13, 15, 32, 45, 77, 100};

        System.out.println("Mảng có sẵn là: " + Arrays.toString(arr));

        System.out.print("Nhập 1 số bất kì: ");
        int check = java.lang.Integer.parseInt(scanner.nextLine());

        Integer search = new Integer();

        search.showIndex(arr, check);
    }
}
