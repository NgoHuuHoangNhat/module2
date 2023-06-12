package algorithms.bai_10;

public class Money {
    public static int exchangeMoney(int[] arr, int totalMoney) {
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[i] == 0 || arr[j] == 0){
                    continue;
                }
                if (totalMoney - arr[j] + arr[i] > max) {
                    max = totalMoney - arr[j] + arr[i];
                }
            }
        }
        return Math.max(max, totalMoney);
    }
}
