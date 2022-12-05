package TestOnly.MVC_.CaseStudyTask1.Model;

public class Customer extends Person {
    int levelOfSatisfaction;
    String feedback;
    String customerTrend;
    String rankOfCustomer;

    public Customer(String personalCode, int phoneNumber, String dateOfBirth, String gender, String firstName, String lastName, String address, String email) {
        super(personalCode, phoneNumber, dateOfBirth, gender, firstName, lastName, address, email);
    }

    public Customer(String truong, String ha_noi) {
    }

    public int getLevelOfSatisfaction() {
        return levelOfSatisfaction;
    }

    public void setLevelOfSatisfaction(int levelOfSatisfaction) {
        this.levelOfSatisfaction = levelOfSatisfaction;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getCustomerTrend() {
        return customerTrend;
    }

    public void setCustomerTrend(String customerTrend) {
        this.customerTrend = customerTrend;
    }

    public String getRankOfCustomer() {
        return rankOfCustomer;
    }

    public void setRankOfCustomer(String rankOfCustomer) {
        this.rankOfCustomer = rankOfCustomer;
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
