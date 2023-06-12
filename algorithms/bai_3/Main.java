package algorithms.bai_3;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 5, 9};
        System.out.println(arr.length);
        boolean flag = false;
        int firstSum;
        int secondSum;

        for (int i = 0; i < arr.length; i++) {
            firstSum = 0;
            secondSum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i < j) {
                    firstSum += arr[j];
                }
                if (i > j) {
                    secondSum += arr[j];
                }
            }

            if (firstSum == secondSum) {
                flag = true;
            }
        }
        System.out.println(flag);


    }
}

