package org.example.filter.criteria;

import org.example.filter.Person;

import java.util.List;

/**
 * @author sleet
 * @version 2024/5/11
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> list);
}
