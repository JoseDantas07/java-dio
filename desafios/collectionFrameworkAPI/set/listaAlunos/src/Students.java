import java.util.Comparator;
import java.util.Objects;

public class Students implements Comparable<Students>{

    private String name;
    private long registration;
    private double average;

    public Students(String name, long registration, double average) {
        this.name = name;
        this.registration = registration;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public long getRegistration() {
        return registration;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return registration == students.registration;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registration);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                ", average=" + average +
                '}';
    }

    @Override
    public int compareTo(Students p) {
        return name.compareToIgnoreCase(p.getName());
    }
}

class DisplayStudentByGrade implements Comparator<Students>{

    @Override
    public int compare(Students p1, Students p2) {
        return Double.compare(p2.getAverage(), p1.getAverage());
    }
}