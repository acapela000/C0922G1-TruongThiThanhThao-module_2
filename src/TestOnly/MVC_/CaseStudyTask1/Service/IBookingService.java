package TestOnly.MVC_.CaseStudyTask1.Service;

public interface IBookingService extends IService {
    @Override
    void manageQuantity();

    @Override
    void manageQuality();

    void manageBookingTime();
}
