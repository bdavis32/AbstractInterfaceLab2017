package lab1;

/**
 *
 * @author Benjamin
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public ProgrammingCourse(String courseName, String courseNumber){
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseNumber.length() == 0 || courseNumber.isEmpty()) {
            throw new IllegalArgumentException("courseName cannot be null or empty string.");
        }
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseNumber cannot be null of empty string");
//            System.exit(0);
            throw new IllegalArgumentException("courseNumber cannot be null or empty string.");
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
            throw new IllegalArgumentException("credits must be in the range of 0.5 to 4.0.");
        }
        this.credits = credits;
    }
}
