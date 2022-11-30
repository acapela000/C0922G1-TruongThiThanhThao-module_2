package ss19_String_Regex.ValidateClassName;

public class ClassNameMain {
    public static ClassName className;
    public static final String[] validClass = new String[] {"C0318G"};
    public static final String[] invalidClass = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        className = new ClassName();

        for (String name : validClass) {
            boolean isValid = className.validate(name);
            System.out.println("Class name: " + name + "\n" + " is valid: " + isValid);
        }
        for (String name : invalidClass) {
            boolean isValid = className.validate(name);
            System.out.println("Class name: " + name + "\n" + " is valid: " + isValid);

        }
    }
}
