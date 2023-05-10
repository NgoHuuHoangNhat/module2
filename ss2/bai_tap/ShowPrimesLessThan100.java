package ss2.bai_tap;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        boolean flag;
        for (int i = 2; i < 100; i++) {
            flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(i + ", ");
            }
        }
    }
}
