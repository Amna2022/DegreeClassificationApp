import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Grade> level5Grades;
    private List<Grade> level6Grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.level5Grades = new ArrayList<>();
        this.level6Grades = new ArrayList<>();
    }
 
    // Add grades
    public void addLevel5Grade(Grade grade) {
        level5Grades.add(grade);
    }

    public void addLevel6Grade(Grade grade) {
        level6Grades.add(grade);
    }

    // Calculate averages
    public double getLevel5Average() {
        DegreeCalculator calculator = new DegreeCalculator();
        return calculator.calculateAverage(level5Grades);
    }

    public double getLevel6Average() {
        DegreeCalculator calculator = new DegreeCalculator();
        return calculator.calculateAverage(level6Grades);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Grade> getLevel5Grades() {
        return level5Grades;
    }

    public List<Grade> getLevel6Grades() {
        return level6Grades;
    }
}
