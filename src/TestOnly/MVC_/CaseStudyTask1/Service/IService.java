package TestOnly.MVC_.CaseStudyTask1.Service;

import TestOnly.MVC_.CaseStudyTask1.Model.Customer;

import java.util.List;

public interface IService<O> {
    void add(O o);
    List<O> edit(O o);
    List<O> display();
    void delete(O o);

    O search(O o);

}
