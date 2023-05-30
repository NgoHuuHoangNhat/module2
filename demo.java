import java.util.*;

public class demo {
    public static void main(String[] args) {
//        int[] arr = {1,1,2};
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[count] = nums[i + 1];
                count++;
            }
        }
        return count;
    }


}