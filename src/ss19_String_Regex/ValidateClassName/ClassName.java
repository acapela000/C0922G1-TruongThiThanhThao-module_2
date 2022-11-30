package ss19_String_Regex.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;

    public static final String CLASSNAME_REGEX = "^[C,A,P]{1}[a-z0-9]{4}[G, H, I, K, L, M]{1}$";

    public ClassName() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
