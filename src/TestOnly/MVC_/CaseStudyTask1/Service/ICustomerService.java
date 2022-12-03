package TestOnly.MVC_.CaseStudyTask1.Service;

public interface ICustomerService extends IService {
    @Override
    void manageQuantity();

    @Override
    void manageQuality();

    void manageCustomerComplain();
}
