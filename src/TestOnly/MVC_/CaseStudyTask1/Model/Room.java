package TestOnly.MVC_.CaseStudyTask1.Model;

public class Room extends Facility {
    int typeOfBed;
    boolean mealService;
    boolean beautyService;

    public Room(int typeOfService, int capasityOfPeople, int timeOfStay, boolean cleaningService, boolean rentCar, String checkInDate, String checkOutDate) {
        super(typeOfService, capasityOfPeople, timeOfStay, cleaningService, rentCar, checkInDate, checkOutDate);
    }

    @Override
    public String toString() {
        return "== Room ==" + "\n" +
                "\t typeOfBed: " + typeOfBed + "\n" +
                "\t mealService: " + mealService + "\n" +
                "\t beautyService: " + beautyService + "\n" +
                super.toString();
    }
}
