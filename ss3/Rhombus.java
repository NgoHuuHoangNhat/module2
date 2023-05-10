package ss3;

public class Rhombus {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 10 / 2 + i || j == 10 / 2 - i - 1 || j == i - 5 + 1||j == 10 - i +3) {
                    switch (i) {
                        case 0:
                        case 8:
                            System.out.print(1);
                            break;
                        case 1:
                        case 7:
                            System.out.print(2);
                            break;
                        case 6:
                        case 2:
                            System.out.print(3);
                            break;
                        case 3:
                        case 5:
                            System.out.print(4);
                            break;
                        case 4:
                            System.out.print(5);
                            break;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
