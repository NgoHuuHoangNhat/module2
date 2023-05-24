import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr = {-3,3,5,7,1,4,2,1};

        int max = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if(max < arr[i + 1]){
                max = arr[i + 1];
            }
        }


        System.out.println(max);;

    }
}
