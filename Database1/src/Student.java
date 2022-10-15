import java.util.ArrayList;

public class Student {

    private String NAME;
    private int YEAR;
    private int ID;
    private ArrayList<Courses> courses;


    public Student(String NAME, int YEAR) {
        this.NAME = NAME;
        this.YEAR = YEAR;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getYEAR() {
        return YEAR;
    }

    public void setYEAR(int YEAR) {
        this.YEAR = YEAR;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
        this.courses = courses;
    }
}
