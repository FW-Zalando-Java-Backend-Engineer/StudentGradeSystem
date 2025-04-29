package org.school;

/**
 * Student class that implements Comparable to sort naturally by GPA (high to low)
 * */

public class Student implements Comparable<Student> {

    // Fields
    private final String name;
    private  final double gpa; // Grade Point Average

    // Constructor
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

   // Getters
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    /**
     * Natural ordering: sort by GPA descending. (high to low)
     * @param other: other Student comparing with.
     * @return int :
     *  < 0 : this object is less than other (comes first when sorting)
     *  0 : this object is equal to other
     *  > 0 : this object is greater than other (comes after when sorting)
     *
     * */
    @Override
    public int compareTo(Student other) {
        // Here, notice carefully: other.gpa comes first, this.gpa comes second.
        // This reverses the normal ascending order, and makes GPA sorted from high to low (descending order).
        // That means:
        // other.gpa > this.gpa : Return 1 → other comes after this
        // other.gpa == this.gpa : Return 0
        // other.gpa < this.gpa : Return -1 → this comes before other
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString(){
        return name + " (GPA: "+gpa+")";
    }
}
