package lab1;

/**
 *
 * @author Benjamin
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse course1 = new AdvancedJavaCourse("Advanced Java Programming", "152-135");
        System.out.println("Class name: " + course1.getCourseName() +
                         "\nClass number: " + course1.getCourseNumber());
    }
}
