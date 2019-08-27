/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentist.finder.app;

import java.util.ArrayList;

/**
 *
 * @author Deema
 */
public interface Builder {
    public ArrayList<EducationInfo> BuildEduSec(ArrayList<EducationInfo> e);
    public ArrayList<AddressInfo> BuildAddSec(ArrayList<AddressInfo> a);
    public ArrayList<SpecialistInfo> BuildSpecialistSec(ArrayList<SpecialistInfo> s);
}
