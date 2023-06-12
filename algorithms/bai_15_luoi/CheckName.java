package algorithms.bai_15_luoi;

public class CheckName {
    public static boolean checkName(String name, String fileType) {
        switch (fileType) {
            case "class":
                return testClassName(name);
            case "field":
                return testFieldName(name);
//            case "package":
//                break;
//            case "method":
//                break;
            default:
                return false;
        }
    }

    private static boolean testFieldName(String name) {

        return true;
    }

    private static boolean testClassName(String name) {
        String[] arr = name.split("");
        if (arr[0].equals(arr[0].toLowerCase()) || arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].matches("^\\w$")) {
                return false;
            }
        }
        return true;
    }
}
