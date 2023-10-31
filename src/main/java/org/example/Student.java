package org.example;

import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public double getAverageGrade() {
        double sum = 0;
        Double averageSum = grades.stream()
                .reduce(0.0, (acc, x) -> acc +x);
        long count = grades.stream()
                .count();
        return averageSum/count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + getAverageGrade() +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
