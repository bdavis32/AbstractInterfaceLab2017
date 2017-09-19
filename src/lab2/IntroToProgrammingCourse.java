package lab2;

/**
 * @author      Benjamin Davis
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse{


    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("courseNumber cannot be null or empty string");
        }
        this.setCourseNumber(courseNumber);
    }
    
    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("credits must be between 0.5 and 4.0");
        }
        this.setCredits(credits);
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("courseName cannot be null or empty string");
        }
        this.setCourseName(courseName);
    }

    
}
