package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Benjamin Davis
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0 || prerequisites.isEmpty()){
            throw new IllegalArgumentException("Prerequisites cannot be null or empty.");
        }
        this.prerequisites = prerequisites;
    }

}
