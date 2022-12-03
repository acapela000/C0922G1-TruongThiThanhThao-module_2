package TestOnly.MVC_.CaseStudyTask1.Model;

public class Villa extends Facility {
    boolean cleaningPool;
    boolean gardening;
    boolean petCaring;
    boolean parkForKids;
    int numberOfRoom;

    public Villa(int typeOfService, int capasityOfPeople, int timeOfStay, boolean cleaningService, boolean rentCar, String checkInDate, String checkOutDate) {
        super(typeOfService, capasityOfPeople, timeOfStay, cleaningService, rentCar, checkInDate, checkOutDate);
    }

    @Override
    public String toString() {
        return "== Villa ==" + "\n" +
                "\t cleaningPool: " + cleaningPool + "\n" +
                "\t gardening=" + gardening + "\n" +
                "\t petCaring=" + petCaring + "\n" +
                "\t parkForKids=" + parkForKids + "\n" +
                "\t numberOfRoom=" + numberOfRoom + "\n" +
                super.toString();
    }
}
