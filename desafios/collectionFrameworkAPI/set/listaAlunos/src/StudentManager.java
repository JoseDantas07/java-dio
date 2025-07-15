import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    Set<Students> studentsSet;

    public StudentManager() {
        this.studentsSet = new HashSet<>();
    }

    public void addStudent(String name, long registration, double averege){
        studentsSet.add(new Students(name,registration,averege));
    }

    public void removeStudent(long registration){
        Set<Students> studentRemoved = new HashSet<>();
        for (Students s : studentsSet){
            if (s.getRegistration() == registration){
                studentRemoved.add(s);
            }
        }
        studentsSet.removeAll(studentRemoved);
    }

    public Set<Students> displayStudentByName(){
        Set<Students> studentsByName = new TreeSet<>(studentsSet);
        return studentsByName;
    }

    public Set<Students> diplayStudentByGrade(){
        Set<Students> studentByGrade = new TreeSet<>(new DisplayStudentByGrade());
        studentByGrade.addAll(studentsSet);
        return studentByGrade;
    }

    public void displayStudent(){
        System.out.println(studentsSet);
    }
}
