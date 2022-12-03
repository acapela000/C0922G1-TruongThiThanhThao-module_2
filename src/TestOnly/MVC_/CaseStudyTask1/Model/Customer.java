package TestOnly.MVC_.CaseStudyTask1.Model;

public class Customer extends Person {
    int levelOfSatisfaction;
    String feedback;
    String customerTrend;
    String rankOfCustomer;

    public Customer(int personalCode, int phoneNumber, String dateOfBirth, String gender, String firstName, String lastName, String address, String email) {
        super(personalCode, phoneNumber, dateOfBirth, gender, firstName, lastName, address, email);
    }

    @Override
    public String toString() {
        return "== Customer ==" + "\n" +
                "\t levelOfSatisfaction: " + levelOfSatisfaction + "\n" +
                "\t feedback: " + feedback + '\n' +
                "\t customerTrend: " + customerTrend + '\n' +
                "\t rankOfCustomer: " + rankOfCustomer + '\n' +
                super.toString();
    }
}
