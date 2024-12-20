public class DegreeClassification {

    // Maps grade average to degree classification
    public String getClassification(double average) {
        if (average >= 70) {
            return "First Class";               // First class classification
        } else if (average >= 60) {
            return "Upper Second Class (2:1)";   // 2:1 classification
        } else if (average >= 50) {
            return "Lower Second Class (2:2)";   // 2:2 classification
        } else if (average >= 40) {
            return "Third Class";               // Third class classification
        } else {
            return "Fail";                      // Fail classification
        }
    }
}
