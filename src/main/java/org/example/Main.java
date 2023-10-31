package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Иван", Arrays.asList(5.0, 5.0, 5.0, 4.0), "Информатика"));
    studentList.add(new Student("Николай", Arrays.asList(5.0, 5.0, 4.0, 5.0), "Информатика"));
    studentList.add(new Student("Ангелина", Arrays.asList(4.0, 3.0, 3.0, 4.0), "Математика"));
    studentList.add(new Student("Екатерина", Arrays.asList(4.0, 4.0, 4.0, 4.0), "Информатика"));
    studentList.add(new Student("Павел", Arrays.asList(5.0, 5.0, 5.0, 5.0), "Информатика"));
    studentList.add(new Student("Марат", Arrays.asList(5.0, 5.0, 5.0, 4.0), "Математика"));

    List<Student> result = studentList.stream()
                    .filter(st -> (st.getSpecialty() == "Информатика" && st.getAverageGrade() > 4.5))
                    .sorted(new ComparatorByAverageGrade())
                    .limit(5)
                    .toList();

    System.out.println(result);
    }
}