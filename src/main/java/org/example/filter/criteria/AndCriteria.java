package org.example.filter.criteria;

import org.example.filter.Person;

import java.util.List;

/**
 * @author sleet
 * @version 2024/5/11
 */
public class AndCriteria
        implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> firstList = criteria.meetCriteria(list);
        return otherCriteria.meetCriteria(firstList);
    }
}
