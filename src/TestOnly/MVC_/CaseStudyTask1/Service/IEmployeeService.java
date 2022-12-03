package TestOnly.MVC_.CaseStudyTask1.Service;

public interface IEmployeeService extends IService {
    @Override
    void manageQuantity();

    @Override
    void manageQuality();

    void manageEmployeePromotion();
}
