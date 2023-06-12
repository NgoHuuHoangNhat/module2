package algorithms.bai_4;

public class CheckString {

    public static String changeStr(String str) {

        String[] arr = str.split("");
        String newStr = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[i].toUpperCase())) {
                newStr += " " + arr[i];
            } else {
                newStr += arr[i];
            }
        }
        return newStr.trim().toLowerCase();
    }
}
