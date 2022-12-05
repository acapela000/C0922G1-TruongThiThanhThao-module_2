package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Customer;
import TestOnly.MVC_.CaseStudyTask1.Model.Employee;
import TestOnly.MVC_.CaseStudyTask1.Model.Facility;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    static LinkedHashMap<String, Facility> facilityList = new LinkedHashMap<String,Facility>();

    @Override
    public void add(Facility facility) {
        facilityList.put(facility.getDeviceCode(),facility);
    }


    @Override
    public List<Facility> edit(Facility facility) {
        if (facilityList.containsKey(facility.getDeviceCode())) {
            facilityList.replace(facility.getDeviceCode(), facility);
        }
//        for (int i = 0; i < facilityList.size(); i++) {
//            if (Objects.equals(facilityList.get(i).getDeviceCode(),code)) {
//                facilityList.get(i).setDeviceCode(code);
//            }
//        }
        return new ArrayList<>(facilityList.values());
    }

    @Override
    public List<Facility> display() {
        return new ArrayList<>(facilityList.values());
    }

    @Override
    public void delete(Facility facility) {
        facilityList.remove(facility.getDeviceCode());
//        for (int i = 0; i < facilityList.size(); i++) {
//            if (facilityList.get(i).getDeviceCode().equals(facility.getDeviceCode())) {
//                facilityList.remove(facility.getDeviceCode());
//            }
//        }
    }

    @Override
    public Facility search(Facility facility) {
        return facilityList.get(facility.getDeviceCode());
    }

    @Override
    public void manageMaintenanceDeadline() {

    }
}
