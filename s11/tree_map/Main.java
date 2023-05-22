package s11.tree_map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập 1 chuỗi để kiểm tra số lượng từ giống nhau trong chuỗi: ");
        String str = scanner.nextLine();

        TreeMapStr treeMapStr = new TreeMapStr();

        treeMapStr.treeMap(str);


    }
}
