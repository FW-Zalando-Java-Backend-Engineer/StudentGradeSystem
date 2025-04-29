package org.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Student App class used for Simulation
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.9));
        students.add(new Student("Bob", 2.8));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Diana", 4.0));

        System.out.println("Original List:");
//        for(Student std : students){
//            System.out.println(std);
//        }

        students.forEach(System.out::println);
        // For each 'Student' in the list,
        // automatically pass it to the 'method println()' referred by '::' the 'System.out' object.

        // Double.compare(other.gpa, this.gpa);
        //                 Bob         Alice
        // Bob.gpa '2.8' > Alice.gpa '3.9'  : Return  1 → Bob comes before this
        // Bob.gpa '2.8' == Alice.gpa '3.9' : Return  0
        // Bob.gpa '2.8' < Alice.gpa '3.9'  : Return -1 → Alice comes before other
        int result = students.get(0).compareTo(students.get(1));
        System.out.println(result);

        Collections.sort(students);
        System.out.println("\nSorted by GPA (High to Low):");
        students.forEach (System.out::println);

    }
}
