package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public void setCourseName(String courseName){
        if(courseName == null || courseName.isEmpty() || courseName.length() == 0){
            throw new IllegalArgumentException("CourseName cannot be null or empty.");
        }
        this.setCourseName(courseName);
    }
    
    @Override
    public void setCourseNumber(String courseNumber) {
        this.setCourseNumber(courseNumber);
    }

    @Override
    public void setCredits(double credits) {
        this.setCredits(credits);
    }

    public String getPrerequisites() {
        return prerequisites;
    }


    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    
}
