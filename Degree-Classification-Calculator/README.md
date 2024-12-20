# Degree Classification Calculator

## Overview
The **Degree Classification Calculator** is an interactive desktop application designed to help students analyze their academic performance. It calculates a weighted average of grades and classifies students into standard UK degree classifications:
- **First Class**
- **Upper Second Class (2:1)**
- **Lower Second Class (2:2)**
- **Third Class**
- **Fail**

Developed in **Java**, the application features a user-friendly graphical interface built with **Swing**. It integrates well-structured logic and robust error handling to ensure accuracy and reliability.

---

## Features
### User Interface
- Intuitive GUI with vibrant colors and dynamic layouts.
- Input fields for grades, weights, and module names.
- Buttons for adding grades and calculating classifications.
- Displays feedback, including added grades and classification results.

### Core Functionalities
1. **Grade Input:** Add multiple grades with module names and weights.
2. **Weighted Average Calculation:** Computes the average based on weighted grades.
3. **Degree Classification:** Maps the average to UK degree classification standards.

### Data Management
- Encapsulates module data with attributes for module name, grade, and weight.
- Groups Level 5 and Level 6 modules for accurate academic tracking.

### Robust Implementation
- Modular and maintainable **Object-Oriented Programming (OOP)** design.
- Event-driven architecture with responsive error handling.
- Ensures numeric validation for grades and weights.

---

## Testing and Validation
The application has been thoroughly tested with scenarios like:
- Adding grades and ensuring data consistency.
- Handling invalid inputs with user-friendly error messages.
- Accurately calculating weighted averages and classifications.
- Managing edge cases, such as boundary classifications and large data sets.

### Example Test Cases
| Test Case ID | Scenario                              | Input                          | Expected Output                        | Status |
|--------------|--------------------------------------|--------------------------------|----------------------------------------|--------|
| TC01         | Add grade to the system             | Module: "Math", Grade: 70, Weight: 20 | Grade added successfully               | Pass   |
| TC02         | Calculate weighted average          | Grades: [(Math, 70, 20), (Science, 60, 30)] | Weighted average: 64.0                | Pass   |
| TC03         | Classify degree                     | Weighted average: 64.0         | Degree Classification: Upper Second (2:1) | Pass   |

---

## Scalability and Future Enhancements
The modular architecture allows easy scalability. Future features may include:
- Exporting results to a file.
- Integration of advanced analytics.
- Support for additional grading systems and frameworks.

---

## Implementation Details
The application is structured into multiple classes:
- **`DegreeCalculatorGUI`**: Handles the graphical user interface.
- **`DegreeCalculator` & `DegreeClassification`**: Manage backend computations like grade averaging and classification.

Event-driven architecture is achieved using **action listeners** bound to GUI elements, enhancing responsiveness and interactivity.

---

## Conclusion
The **Degree Classification Calculator** offers an efficient and user-friendly tool for tracking academic performance. Its intuitive interface, accurate computations, and modular design make it an invaluable resource for students and educators alike.

---

## References
- Sunday, K. et al. (2020). *Analyzing student performance in programming education using classification techniques*. IJET, 15(2), pp.127-144.
- Rahman, M. et al. (2022). *Grading system prediction of educational performance analysis using data mining approach*. Malaysian Journal of Science and Advanced Technology, pp.204-211.
- ChatGPT.

