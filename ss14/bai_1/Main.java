package ss14.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEdge;
        int secondEdge;
        int thirdEdge;
        while (true) {
            System.out.print("Nhập độ dài cạnh thứ 1: ");
            try {
                firstEdge = Integer.parseInt(scanner.nextLine());
                checkEdge(firstEdge);
                break;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println(illegalTriangleException.getMessage());
            }
        }

        while (true) {
            System.out.print("Nhập độ dài cạnh thứ 2: ");
            try {
                secondEdge = Integer.parseInt(scanner.nextLine());
                checkEdge(secondEdge);
                break;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println(illegalTriangleException.getMessage());
            }
        }

        while (true) {
            System.out.print("Nhập độ dài cạnh thứ 3: ");
            try {
                thirdEdge = Integer.parseInt(scanner.nextLine());
                checkEdge(thirdEdge);
                break;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println(illegalTriangleException.getMessage());
            }
        }
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
        if (firstEdge + secondEdge <= thirdEdge || firstEdge + thirdEdge <= secondEdge ||
                secondEdge + thirdEdge <= firstEdge) {
            throw new IllegalTriangleException("Đây không phải 3 cạnh của 1 tam giác!");
        }
    }

    public static void checkEdge(int edge) throws IllegalTriangleException {
        if (edge <= 0) {
            throw new IllegalTriangleException("Đây không phải là 1 cạnh của tam giác, Yêu cầu nhập lại!");
        }
    }

}
