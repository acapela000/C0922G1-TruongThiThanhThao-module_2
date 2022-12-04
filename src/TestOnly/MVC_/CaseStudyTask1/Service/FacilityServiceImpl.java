package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Facility;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    static LinkedHashMap<Integer, Facility> facilityList = new LinkedHashMap<Integer,Facility>();
    @Override
    public void add(Facility facility) {
        facilityList.put(0,facility);
    }

    @Override
    public void add() {

    }

    @Override
    public void edit(String code, Facility facility) {
        for (int i = 0; i < facilityList.size(); i++) {
            if (Objects.equals(facilityList.get(i).getDeviceCode(),code)) {
                facilityList.get(i).setDeviceCode(Integer.parseInt(code));
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public List<Facility> display() {

        return (List<Facility>) facilityList;
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public void manageMaintenanceDeadline() {

    }
}
