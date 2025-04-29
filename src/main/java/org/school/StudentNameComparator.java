package org.school;


import java.util.Comparator;

/**
 * Comparator to sort students alphabetically by name.
 * */
public class StudentNameComparator implements Comparator<Student> {
    /**
     *  A custom comparator to sort students by name alphabetically.
     * */
    @Override
    public int compare(Student s1, Student s2) {

        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
