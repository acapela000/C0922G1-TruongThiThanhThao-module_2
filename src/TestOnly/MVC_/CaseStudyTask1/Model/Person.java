package TestOnly.MVC_.CaseStudyTask1.Model;

public abstract class Person {
    String personalCode;
    int phoneNumber;
    String dateOfBirth;
    String gender;
    String firstName;
    String lastName;
    String address;
    String email;

    public Person() {
    }

    public Person(String personalCode, int phoneNumber, String dateOfBirth, String gender, String firstName, String lastName, String address, String email) {
        this.personalCode = personalCode;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "== Person ==" + "\n" +
                "\t personalCode: " + personalCode + "\n" +
                "\t phoneNumber: " + phoneNumber + "\n" +
                "\t dateOfBirth: " + dateOfBirth + "\n" +
                "\t Gender: " + gender + "\n" +
                "\t firstName: " + firstName + "\n" +
                "\t lastName: " + lastName + "\n" +
                "\t address: " + address + "\n" +
                "\t email: " + email;
    }
}
