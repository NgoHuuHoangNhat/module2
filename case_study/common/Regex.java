package case_study.common;

public class Regex {

    private final static String ID_EMPLOYEE = "NV\\-\\d{4}";
    private static final String ID_CUSTOMER = "KH\\-\\d{4}";
    private static final String DATE_OF_BIRTH = "^(19|20)?[0-9]{2}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
    private static final String PASS_PORT = "^((\\d{12})|(\\d{9}))$";
    private static final String NUMBER_PHONE = "^0\\d{9}$";
    private static final String EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String NAME = "^(([A-Z])(([a-z]+)|)(\\s|$))+$";
    private static final String ID_VILLA = "^SVVL\\-\\d{4}$";
    private static final String ID_ROOM = "^SVRO\\-\\d{4}$";
    private static final String ID_HOUSE = "^SVHO\\-\\d{4}$";
    private static final String ID_BOOKING = "^BK\\-\\d{4}$";
    private static final String SERVICE_NAME = "^[A-Z](.+|)$";
    private static final String GENDER = "^[A-Z](.+|)$";

    public static boolean checkServiceName(String serviceName){
        return serviceName.matches(SERVICE_NAME);
    }
    public static boolean checkIdVilla(String id){
        return id.matches(ID_VILLA);
    }
    public static boolean checkIdRoom(String id){
        return id.matches(ID_ROOM);
    }
    public static boolean checkIdHouse(String id){
        return id.matches(ID_HOUSE);
    }

    public static boolean checkName(String name) {
        return name.matches(NAME);
    }

    public static boolean checkEmail(String email) {
        return email.matches(EMAIL);
    }

    public static boolean checkNumberPhone(String numberPhone) {
        return numberPhone.matches(NUMBER_PHONE);
    }

    public static boolean checkIdEmployee(String id) {
        return id.matches(ID_EMPLOYEE);
    }

    public static boolean checkIdCustomer(String id) {
        return id.matches(ID_CUSTOMER);
    }

    public static boolean checkDateOfBirth(String dateOfBirth) {
        return dateOfBirth.matches(DATE_OF_BIRTH);
    }

    public static boolean checkPassPort(String passPort) {
        return passPort.matches(PASS_PORT);
    }

    public static boolean checkIDBooking(String id) {
        return id.matches(ID_BOOKING);
    }

    public static boolean checkGender(String gender) {
        return gender.matches(GENDER);
    }
}
