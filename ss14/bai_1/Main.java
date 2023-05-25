package ss14.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh thứ 1: ");
        int firstEdge = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập độ dài cạnh thứ 2: ");
        int secondEdge = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập độ dài cạnh thứ 3: ");
        int thirdEdge = Integer.parseInt(scanner.nextLine());

        try {
            checkTriangle(firstEdge, secondEdge, thirdEdge);
            System.out.println("3 cạnh nhập vào là 3 cạnh của tam giác! ");
        } catch (IllegalTriangleException illegalTriangleException) {
            System.out.println(illegalTriangleException.getMessage());
        } finally {
            System.out.println("Ctrl F5 để chạy lại!!!");
        }
    }

    public static void checkTriangle(int firstEdge, int secondEdge, int thirdEdge) throws IllegalTriangleException {
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0 ||
                firstEdge + secondEdge <= thirdEdge || firstEdge + thirdEdge <= secondEdge ||
                secondEdge + thirdEdge <= firstEdge) {
            throw new IllegalTriangleException("Đây không phải 3 cạnh của 1 tam giác!");
        }
    }

}
