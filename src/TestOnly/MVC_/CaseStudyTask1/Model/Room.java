package TestOnly.MVC_.CaseStudyTask1.Model;

public class Room extends Facility {
    int typeOfBed;
    boolean mealService;
    boolean beautyService;

    public Room(String typeOfService, int capasityOfPeople, int timeOfStay, boolean cleaningService, boolean rentCar, String checkInDate, String checkOutDate) {
        super(typeOfService, capasityOfPeople, timeOfStay, cleaningService, rentCar, checkInDate, checkOutDate);
    }

    public int getTypeOfBed() {
        return typeOfBed;
    }

    public void setTypeOfBed(int typeOfBed) {
        this.typeOfBed = typeOfBed;
    }

    public boolean isMealService() {
        return mealService;
    }

    public void setMealService(boolean mealService) {
        this.mealService = mealService;
    }

    public boolean isBeautyService() {
        return beautyService;
    }

    public void setBeautyService(boolean beautyService) {
        this.beautyService = beautyService;
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
