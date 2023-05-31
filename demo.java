import java.util.*;

public class demo {
    public static void main(String[] args) {

        float n = 4;

        float sum = 0;
        for (float i = 0; i <= n; i++) {
            sum += 1/(2*i+1);
        }

        System.out.println(sum);


    }

}