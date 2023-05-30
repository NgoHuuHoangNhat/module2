package ss17.bai_tap.bai_1;

public class ValidateClassesName {
    private static final String CLASSES_NAME_VALIDATE = "^(C|A|P)\\d{4}(G|H|I|K)$";

    public static boolean checkClassesName(String classesName) {
        return classesName.matches(CLASSES_NAME_VALIDATE);
    }
}
