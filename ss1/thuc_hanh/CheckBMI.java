package ss1.thuc_hanh;

import java.util.Scanner;

public class CheckBMI {
    public static void main(String[] args) {
        float height, weigt, bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat();

        System.out.println("Nhập chiều cân nặng: ");
        weigt = scanner.nextFloat();

        bmi = weigt / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 25) {
            System.out.println("Normal");
        } else if (bmi <= 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
