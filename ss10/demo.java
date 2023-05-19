package ss10;

import java.util.*;

public class demo {
    public static void main(String[] args) {

        String string = "qwertytrewq";
        boolean result = checkPalindrome(string);
        System.out.println(result);

    }

    public static boolean checkPalindrome(String string) {
        String[] newString = string.split("");

        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();

        for (String i: newString) {
            stringQueue.add(i);
            stringStack.push(i);
        }
        System.out.println(stringQueue);
        System.out.println(stringStack);

        int newSize = stringStack.size();

        for (int i = 0; i < newSize; i++) {
            if(!stringStack.pop().equals(stringQueue.poll())) {
                return false;
            }
        }
        return true;
    }
}