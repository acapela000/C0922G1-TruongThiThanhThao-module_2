package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Facility;

import java.util.List;

public interface IFacilityService extends IService {
    void add(Facility facility);

    @Override
    void add();

    @Override
    void edit();

    void edit(String code, Facility facility);

    @Override
    List<Facility> display();

    @Override
    void delete();

    @Override
    void search();

    void manageMaintenanceDeadline();
}
