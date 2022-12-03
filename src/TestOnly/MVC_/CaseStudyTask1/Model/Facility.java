package TestOnly.MVC_.CaseStudyTask1.Model;

public abstract class Facility {
    int typeOfService;
    int capasityOfPeople;
    int timeOfStay;
    boolean cleaningService;
    boolean rentCar;
    String checkInDate;
    String checkOutDate;

    public Facility(int typeOfService, int capasityOfPeople, int timeOfStay, boolean cleaningService, boolean rentCar, String checkInDate, String checkOutDate) {
        this.typeOfService = typeOfService;
        this.capasityOfPeople = capasityOfPeople;
        this.timeOfStay = timeOfStay;
        this.cleaningService = cleaningService;
        this.rentCar = rentCar;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "== Facility ==" + "\n" +
                "\t typeOfService: " + typeOfService + "\n" +
                "\t capasityOfPeople=" + capasityOfPeople + "\n" +
                "\t timeOfStay=" + timeOfStay + "\n" +
                "\t cleaningService=" + cleaningService + "\n" +
                "\t rentCar=" + rentCar + "\n" +
                "\t checkInDate='" + checkInDate + '\n' +
                "\t checkOutDate='" + checkOutDate;
    }
}
