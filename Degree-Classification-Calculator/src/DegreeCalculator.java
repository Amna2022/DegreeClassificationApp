import java.util.List;

public class DegreeCalculator {

    // Calculate the weighted average of grades
    public double calculateAverage(List<Grade> grades) {
        if (grades.isEmpty()) return 0;

        double totalWeightedGrades = 0;
        double totalWeight = 0;

        for (Grade grade : grades) {
            totalWeightedGrades += grade.getGrade() * grade.getWeight();
            totalWeight += grade.getWeight();
        }

        return totalWeightedGrades / totalWeight;
    }

    // Method A
    public double calculateMethodA(Student student) {
        double level5Average = calculateAverage(student.getLevel5Grades());
        double level6Average = calculateAverage(student.getLevel6Grades());
        return (level5Average + level6Average) / 2;
    }

    // Method B
    public double calculateMethodB(Student student) {
        double level5Average = calculateAverage(student.getLevel5Grades());
        double level6Average = calculateAverage(student.getLevel6Grades());
        return (level5Average + 2 * level6Average) / 3;
    }

    // Method C
    public double calculateMethodC(Student student) {
        return calculateAverage(student.getLevel6Grades());
    }

    // Method D
    public String calculateMethodD(Student student) {
        int totalCredits = 0;
        int firstClassCredits = 0;

        for (Grade grade : student.getLevel5Grades()) {
            totalCredits += grade.getWeight();
            if (grade.getGrade() >= 70) firstClassCredits += grade.getWeight();
        }

        for (Grade grade : student.getLevel6Grades()) {
            int weightedCredits = (int) (grade.getWeight() * 2);
            totalCredits += weightedCredits;
            if (grade.getGrade() >= 70) firstClassCredits += weightedCredits;
        }

        return (firstClassCredits * 100.0 / totalCredits) >= 50 ? "1st" : "Lower Classification";
    }
}
