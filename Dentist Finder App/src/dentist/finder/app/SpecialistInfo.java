/*
 * this class define the information related to specialist dentist.
 */
package dentist.finder.app;

/**
 *
 * @author Deema
 */
public class SpecialistInfo {
    private String SpecialistArea;
    private int year;
  
    public SpecialistInfo(){}
    public SpecialistInfo(String SpecialistArea, int year) {
        this.SpecialistArea = SpecialistArea;
        this.year = year;
    }

    public String getSpecialistArea() {
        return SpecialistArea;
    }

    public void setSpecialistArea(String SpecialistArea) { 
        this.SpecialistArea = SpecialistArea;
    }
   
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  " .Specialist Area : "  + SpecialistArea + "  year : " + year + "\n";
    }

   
}
