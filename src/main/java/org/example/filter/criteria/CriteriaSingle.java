package org.example.filter.criteria;

import org.example.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sleet
 * @version 2024/5/11
 */
public class CriteriaSingle
        implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> singleList = new ArrayList<>();
        for (Person person : list) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                singleList.add(person);
            }
        }
        return singleList;
    }
}
