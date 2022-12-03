package TestOnly.MVC_.CaseStudyTask1.Service;

public interface IFacilityService extends IService {
    @Override
    void manageQuantity();

    @Override
    void manageQuality();

    void manageFacilityMaker();
}
