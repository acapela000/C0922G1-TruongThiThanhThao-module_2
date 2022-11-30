package ss19_String_Regex.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static Pattern pattern;
    private Matcher matcher;

    public static final String PHONE_NUMBER = "^[(][0-9]{2}[)]+[-][(][0-9]{1,10}[)]$";

    public PhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
