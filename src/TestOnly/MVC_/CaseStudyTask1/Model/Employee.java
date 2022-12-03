package TestOnly.MVC_.CaseStudyTask1.Model;

public class Employee extends Person {
    int workHour;
    long salary;
    String typeOfContract;
    String workAttitude;
    String typeOfDegree;
    boolean extraPay;
    boolean marriageStatus;

    public Employee(int personalCode, int phoneNumber, String dateOfBirth, String gender, String firstName, String lastName, String address, String email) {
        super(personalCode, phoneNumber, dateOfBirth, gender, firstName, lastName, address, email);
    }

    @Override
    public String toString() {
        return "== Employee ==" + '\n' +
                "\t workHour: " + workHour + '\n' +
                "\t salary=" + salary + '\n' +
                "\t typeOfContract='" + typeOfContract + '\n' +
                "\t workAttitude='" + workAttitude + '\n' +
                "\t typeOfDegree='" + typeOfDegree + '\n' +
                "\t extraPay=" + extraPay + "\n" +
                "\t marriageStatus=" + marriageStatus + "\n" +
                super.toString();
    }
}
