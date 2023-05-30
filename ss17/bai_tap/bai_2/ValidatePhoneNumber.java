package ss17.bai_tap.bai_2;

public class ValidatePhoneNumber {
    private static final String VALIDATE_PHONE_NUMBER = "^(\\((\\d{2})\\))\\-(\\((0\\d{9})\\))$";
    public static boolean checkPhoneNumber(String phoneNumber){
        return phoneNumber.matches(VALIDATE_PHONE_NUMBER);
    }
}
