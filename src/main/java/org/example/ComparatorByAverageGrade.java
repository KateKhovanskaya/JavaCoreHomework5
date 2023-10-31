package org.example;

import java.util.Comparator;

public class ComparatorByAverageGrade<T extends Student> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return  Double.compare(o2.getAverageGrade(), o1.getAverageGrade());
    }

}
