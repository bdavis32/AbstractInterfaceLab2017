/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Benjamin
 */
public abstract class ProgrammingCourse implements Course{
    private String courseName;
    private String courseNumber;
    private double credits;

    @Override
    public String getCourseName() {
        return courseName;
    }
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    @Override
    public double getCredits() {
        return credits;
    }
    @Override
    public abstract void setCourseNumber(String courseNumber);
    @Override
    public abstract void setCourseName(String courseName);
    @Override
    public abstract void setCredits(double credits);    
}
