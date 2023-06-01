package case_study.common;

public class Regex {

    private final static String ID = "NV\\-\\d{4}";
    private static final String DATE_OF_BIRTH = "^(19|20)?[0-9]{2}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
    private static final String PASS_PORT = "^((\\d{12})|(\\d{9}))$";
    private static final String NUMBER_PHONE = "^0\\d{9}$";
    private static final String EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String NAME = "^^(([A-Z])([a-z]+)(\\s|$))*$";

    public static boolean checkName(String name) {

        return name.matches(NAME);
    }

    public static boolean checkEmail(String email) {
        return email.matches(EMAIL);
    }

    public static boolean checkNumberPhone(String numberPhone) {
        return numberPhone.matches(NUMBER_PHONE);
    }

    public static boolean checkId(String id) {
        return id.matches(ID);
    }

    public static boolean checkDateOfBirth(String dateOfBirth) {
        return dateOfBirth.matches(DATE_OF_BIRTH);
    }

    public static boolean checkPassPort(String passPort) {
        return passPort.matches(PASS_PORT);
    }

}
