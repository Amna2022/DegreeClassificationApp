public class Grade {
    private String moduleName;
    private double grade;
    private double weight;

    // Constructor
    public Grade(String moduleName, double grade, double weight) {
        this.moduleName = moduleName;
        this.grade = grade;
        this.weight = weight;
    }

    // Getters and Setters
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
