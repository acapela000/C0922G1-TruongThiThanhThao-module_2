package TestOnly.MVC_.CaseStudyTask1.Model;

public class Employee extends Person {
    int workHour;
    long salary;
    String typeOfContract;
    String workAttitude;
    String typeOfDegree;
    boolean extraPay;
    boolean marriageStatus;

    public Employee(String thanh, String new_york) {}

    public Employee(String personalCode, int phoneNumber, String dateOfBirth, String gender, String firstName, String lastName, String address, String email) {
        super(personalCode, phoneNumber, dateOfBirth, gender, firstName, lastName, address, email);
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    public void setTypeOfContract(String typeOfContract) {
        this.typeOfContract = typeOfContract;
    }

    public String getWorkAttitude() {
        return workAttitude;
    }

    public void setWorkAttitude(String workAttitude) {
        this.workAttitude = workAttitude;
    }

    public String getTypeOfDegree() {
        return typeOfDegree;
    }

    public void setTypeOfDegree(String typeOfDegree) {
        this.typeOfDegree = typeOfDegree;
    }

    public boolean isExtraPay() {
        return extraPay;
    }

    public void setExtraPay(boolean extraPay) {
        this.extraPay = extraPay;
    }

    public boolean isMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(boolean marriageStatus) {
        this.marriageStatus = marriageStatus;
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
