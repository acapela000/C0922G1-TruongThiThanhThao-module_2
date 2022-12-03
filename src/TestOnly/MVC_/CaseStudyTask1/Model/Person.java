package TestOnly.MVC_.CaseStudyTask1.Model;

public abstract class Person {
    int personalCode;
    int phoneNumber;
    String dateOfBirth;
    String Gender;
    String firstName;
    String lastName;
    String address;
    String email;

    public Person(int personalCode, int phoneNumber, String dateOfBirth, String gender, String firstName, String lastName, String address, String email) {
        this.personalCode = personalCode;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        Gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public String toString() {
        return "== Person ==" + "\n" +
                "\t personalCode: " + personalCode + "\n" +
                "\t phoneNumber: " + phoneNumber + "\n" +
                "\t dateOfBirth: " + dateOfBirth + "\n" +
                "\t Gender: " + Gender + "\n" +
                "\t firstName: " + firstName + "\n" +
                "\t lastName: " + lastName + "\n" +
                "\t address: " + address + "\n" +
                "\t email: " + email;
    }
}
