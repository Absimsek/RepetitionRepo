package AUG2025.JUL22;

public class Course {

    /*
    THE CLASSES CONSIST OF
    1) private variables;
    2) Parametrized and non-parametrized constructors
    3) getters
    4) setters
    5) toString() method
    are called "POJO" class ==> POJO (Plain Old Java Object)
     */

    private String season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    public Course() {//default non-parametrized constructor
    }

    public Course(String season, String courseName, int averageScore, int numberOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }


    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + averageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
