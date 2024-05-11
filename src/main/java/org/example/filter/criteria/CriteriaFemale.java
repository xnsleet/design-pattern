package org.example.filter.criteria;

import org.example.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sleet
 * @version 2024/5/11
 */
public class CriteriaFemale
        implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> femaleList = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femaleList.add(person);
            }
        }
        return femaleList;
    }
}
