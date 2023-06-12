package algorithms.bai_11;

public class NumberOfPencil {
    public static int getTotalPencilNeedBuy(int x, int y, int s) {
        int temp = 0;
        int z = 0;
        if (y == 0) {
            return s;
        }
        while (temp < s) {
            if (s - temp > x) {
                temp += x + y;
                z += x;
            } else {
                z += s - temp;
                break;
            }
        }
        return z;
    }
}
