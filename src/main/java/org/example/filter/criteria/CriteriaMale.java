package org.example.filter.criteria;

import org.example.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sleet
 * @version 2024/5/11
 */
public class CriteriaMale
        implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> maleList = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("male")) {
                maleList.add(person);
            }
        }
        return maleList;
    }
}
