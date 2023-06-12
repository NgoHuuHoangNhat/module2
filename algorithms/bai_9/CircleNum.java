package algorithms.bai_9;

public class CircleNum {
    public static int findCircleNum(int startNum, int endNum) {
        int last;
        int first;
        int num;
        int count = 0;
        for (int i = startNum; i < endNum; i++) {
            last = i % 10;
            num = i;
            do {
                first = num % 10;
                num /= 10;
            } while (num != 0);
            if (last == first) {
                count++;
            }
        }

        return count;
    }
}
