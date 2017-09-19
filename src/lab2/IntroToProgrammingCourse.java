package lab2;

/**
 * @author      Benjamin Davis
 * @version     1.00
 */
public class IntroToProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("credits must be between 0.5 and 4.0");
        }
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("courseName cannot be null or empty string");
        }
        this.courseName = courseName;
    }

    
}
