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

public class Dentist implements Builder {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Website;
    private int PhoneNo;
    private String LicenseName;
    private String LicenseNo;
    private int PracticeYears;
    private String Gender;
    ArrayList <AddressInfo> AddArray = new ArrayList<AddressInfo>();
    ArrayList <EducationInfo> EduArray = new ArrayList<EducationInfo>();
    ArrayList <SpecialistInfo> SpeArray = new ArrayList<SpecialistInfo>();
    
    public Dentist(){}
    public Dentist(String FirstName, String LastName, String Email, String Website, int PhoneNo, String LicenseName, String LicenseNo, int PracticeYears, String Gender) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Website = Website;
        this.PhoneNo = PhoneNo;
        this.LicenseName = LicenseName;
        this.LicenseNo = LicenseNo;
        this.PracticeYears = PracticeYears;
        this.Gender = Gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getLicenseName() {
        return LicenseName;
    }

    public void setLicenseName(String LicenseName) {
        this.LicenseName = LicenseName;
    }

    public String getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(String LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    public int getPracticeYears() {
        return PracticeYears;
    }

    public void setPracticeYears(int PracticeYears) {
        this.PracticeYears = PracticeYears;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @Override
    /*this build function take an education section information as an object which has been created in portal form class
      and add it to an array in order to build and save all education information for a dentist.*/
    public void BuildEduSection (EducationInfo e) {
        
        EduArray.add(e);
    }

    @Override
    /*this build function take an specialist section information as an object which has been created in portal form class
      and add it to an array in order to build and save all specialist information for a dentist*/
    public void BuildAddSection (AddressInfo a) {
        AddArray.add(a);
    }

    @Override
    /*this build function take an address section information as an object which has been created in portal form class
      and add it to an array in order to build and save all address information for a dentist*/
    public  void BuildSpecialistSection (SpecialistInfo s) {
        SpeArray.add(s);
    }
  
}
