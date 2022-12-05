package TestOnly.MVC_.CaseStudyTask1.Model;

public abstract class Facility {
    String deviceCode;
    int capasityOfPeople;
    int timeOfStay;
    boolean cleaningService;
    boolean rentCar;
    String typeOfService;
    String checkInDate;
    String checkOutDate;

    public Facility(String deviceCode, String typeOfService, int capasityOfPeople, int timeOfStay, boolean cleaningService, boolean rentCar, String checkInDate, String checkOutDate) {
        this.deviceCode = deviceCode;
        this.typeOfService = typeOfService;
        this.capasityOfPeople = capasityOfPeople;
        this.timeOfStay = timeOfStay;
        this.cleaningService = cleaningService;
        this.rentCar = rentCar;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Facility() {
    }

    public Facility(String typeOfService, int capasityOfPeople, int timeOfStay, boolean cleaningService, boolean rentCar, String checkInDate, String checkOutDate) {
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    @Override
    public String toString() {
        return "== Facility ==" + "\n" +
                "\t deviceCode: " + deviceCode + "\n" +
                "\t typeOfService: " + typeOfService + "\n" +
                "\t capasityOfPeople=" + capasityOfPeople + "\n" +
                "\t timeOfStay=" + timeOfStay + "\n" +
                "\t cleaningService=" + cleaningService + "\n" +
                "\t rentCar=" + rentCar + "\n" +
                "\t checkInDate='" + checkInDate + '\n' +
                "\t checkOutDate='" + checkOutDate;
    }



}
