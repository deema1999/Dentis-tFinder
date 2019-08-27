/*
 * this class define the information about dentist education.
 */
package dentist.finder.app;

/**
 *
 * @author Deema
 */
public class EducationInfo {
    private String Degree;
    private String Major;
    private String School;
    private int year;
public EducationInfo(){}
    public EducationInfo(String Degree, String Major, String School, int year) {
        this.Degree = Degree;
        this.Major = Major;
        this.School = School;
        this.year = year;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  ".Degree : " + Degree + "   Major : "  + Major + "  School : " + School + "  year : " + year + '\n';
    }
    
}
