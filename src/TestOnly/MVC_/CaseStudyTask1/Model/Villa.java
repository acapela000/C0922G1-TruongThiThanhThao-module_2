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

    public boolean isCleaningPool() {
        return cleaningPool;
    }

    public void setCleaningPool(boolean cleaningPool) {
        this.cleaningPool = cleaningPool;
    }

    public boolean isGardening() {
        return gardening;
    }

    public void setGardening(boolean gardening) {
        this.gardening = gardening;
    }

    public boolean isPetCaring() {
        return petCaring;
    }

    public void setPetCaring(boolean petCaring) {
        this.petCaring = petCaring;
    }

    public boolean isParkForKids() {
        return parkForKids;
    }

    public void setParkForKids(boolean parkForKids) {
        this.parkForKids = parkForKids;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
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
