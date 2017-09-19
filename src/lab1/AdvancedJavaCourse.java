package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Benjamin Davis
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
//  These are properties from the superclass ProgrammingCourse
//    private String courseName;
//    private String courseNumber;
//    private double credits;
//  End of common properties
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }
    public String getPrerequisites() {
        return prerequisites;
    }
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
           /* JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);*/
           throw new IllegalArgumentException("Prerequisites cannot be null or empty string");
        }
        this.prerequisites = prerequisites;
    }
}
