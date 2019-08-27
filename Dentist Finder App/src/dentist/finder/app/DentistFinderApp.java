/*
 * Project Documentation : 
    This project collect dentist data from user in order to include that in "Dentist Finder" project
    and it also show a preview of the dentist record.

   Done by : Deema Hafiz 
             Latifa Masri
 */
package dentist.finder.app;

import java.util.ArrayList;

/**
 *
 * @author Deema
 */
public class DentistFinderApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create an object from portal frame in order to enable user to enter dentist data.
        portal p = new portal();
        p.setVisible(true);
    }
    
}
