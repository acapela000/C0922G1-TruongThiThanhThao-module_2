package TestOnly.MVC_.CaseStudyTask1.Service;

public interface IBookingService extends IService {
    @Override
    void add();

    @Override
    void edit();

    @Override
    void display();

    @Override
    void delete();

    @Override
    void search();

    //extra method
    void manageBookingTime();

}
