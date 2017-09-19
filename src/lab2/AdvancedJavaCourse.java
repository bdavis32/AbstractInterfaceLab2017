package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
//    private String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

//    public String getCourseNumber() {
//        return courseNumber;
//    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.setCourseNumber(courseNumber);
    }

//    public double getCredits() {
//        return credits;
//    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
            throw new IllegalArgumentException("credits must be between 0.5 and 4.0");
        }
        this.setCredits(credits);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: prerequisites cannot be null of empty string");
//            System.exit(0);
            throw new IllegalArgumentException("Prerequisites cannot be null or empty");
        }
        this.prerequisites = prerequisites;
    }

//    public String getCourseName() {
//        return courseName;
//    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseName cannot be null of empty string");
//            System.exit(0);
            throw new IllegalArgumentException("courseName cannot be null or empty.");
        }
        this.setCourseName(courseName);
    }

    
}
