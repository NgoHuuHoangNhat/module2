import java.util.*;

public class demo {
    public static void main(String[] args) {
        int x = 121;

        String num = Integer.toString(x);

        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) != num.charAt(num.length()-i-1)){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
