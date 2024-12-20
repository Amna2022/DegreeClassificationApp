import javax.swing.*;
import java.awt.*;

public class DegreeCalculatorGUI {
    private JFrame frame;
    private JTextField studentNameField, gradeField, weightField, moduleNameField;
    private JTextArea resultArea;
    private Student student;

    public DegreeCalculatorGUI() {
        frame = new JFrame("Degree Classification Calculator");
        frame.setLayout(new FlowLayout());
        frame.setSize(600, 600);

        // Student name input
        frame.add(new JLabel("Student Name:"));
        studentNameField = new JTextField(20);
        frame.add(studentNameField);

        // Grade input
        frame.add(new JLabel("Module Name:"));
        moduleNameField = new JTextField(20);
        frame.add(moduleNameField);

        frame.add(new JLabel("Grade:"));
        gradeField = new JTextField(5);
        frame.add(gradeField);

        frame.add(new JLabel("Weight:"));
        weightField = new JTextField(5);
        frame.add(weightField);

        // Buttons for grade input and calculation
        JButton addLevel5GradeButton = new JButton("Add Level 5 Grade");
        JButton addLevel6GradeButton = new JButton("Add Level 6 Grade");
        JButton calculateButton = new JButton("Calculate Classification");

        frame.add(addLevel5GradeButton);
        frame.add(addLevel6GradeButton);
        frame.add(calculateButton);

        // Result display
        resultArea = new JTextArea(15, 50);
        resultArea.setEditable(false);
        frame.add(new JScrollPane(resultArea));

        // Action listeners
        addLevel5GradeButton.addActionListener(e -> addGrade(true));
        addLevel6GradeButton.addActionListener(e -> addGrade(false));
        calculateButton.addActionListener(e -> calculateClassification());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void addGrade(boolean isLevel5) {
        try {
            String name = moduleNameField.getText();
            double grade = Double.parseDouble(gradeField.getText());
            double weight = Double.parseDouble(weightField.getText());

            if (name.isEmpty() || grade < 0 || grade > 100 || weight <= 0) {
                resultArea.append("Error: Invalid input. Please check your values.\n");
                return;
            }

            Grade gradeObj = new Grade(name, grade, weight);

            if (student == null) {
                student = new Student(studentNameField.getText());
            }

            if (isLevel5) {
                student.addLevel5Grade(gradeObj);
                resultArea.append("Added to Level 5: " + name + " - " + grade + " (" + weight + ")\n");
            } else {
                student.addLevel6Grade(gradeObj);
                resultArea.append("Added to Level 6: " + name + " - " + grade + " (" + weight + ")\n");
            }

            // Clear input fields
            moduleNameField.setText("");
            gradeField.setText("");
            weightField.setText("");

        } catch (NumberFormatException ex) {
            resultArea.append("Error: Invalid number format. Please enter valid numerical values.\n");
        }
    }

    private void calculateClassification() {
        if (student == null) {
            resultArea.append("No grades available to calculate classification.\n");
            return;
        }

        DegreeCalculator calculator = new DegreeCalculator();

        // Calculate using each method
        double methodAResult = calculator.calculateMethodA(student);
        double methodBResult = calculator.calculateMethodB(student);
        double methodCResult = calculator.calculateMethodC(student);
        String methodDResult = calculator.calculateMethodD(student);

        // Determine classifications
        DegreeClassification classification = new DegreeClassification();
        String classA = classification.getClassification(methodAResult);
        String classB = classification.getClassification(methodBResult);
        String classC = classification.getClassification(methodCResult);

        // Find the best classification
        double bestMean = Math.max(methodAResult, Math.max(methodBResult, methodCResult));
        String bestClassification = classification.getClassification(bestMean);

        // Display results
        resultArea.append("\n--- Classification Results ---\n");
        resultArea.append("Student: " + student.getName() + "\n");
        resultArea.append("Level 5 Average: " + student.getLevel5Average() + "\n");
        resultArea.append("Level 6 Average: " + student.getLevel6Average() + "\n");
        resultArea.append("Method A: " + methodAResult + " (" + classA + ")\n");
        resultArea.append("Method B: " + methodBResult + " (" + classB + ")\n");
        resultArea.append("Method C: " + methodCResult + " (" + classC + ")\n");
        resultArea.append("Method D: " + methodDResult + "\n");
        resultArea.append("Best Classification: " + bestClassification + "\n");
        resultArea.append("-------------------------------\n");
    }

    public static void main(String[] args) {
        new DegreeCalculatorGUI();
    }
}
