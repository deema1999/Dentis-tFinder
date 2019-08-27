/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentist.finder.app;

/**
 *
 * @author Deema
 */
public class AddressInfo {
    private String Country;
    private String State;
    private String City;
    private String Street;
    private int PostalCode;
    
    public AddressInfo()
    {
    }
    public AddressInfo(String Country, String State, String City, String Street, int PostalCode) {
        this.Country = Country;
        this.State = State;
        this.City = City;
        this.Street = Street;
        this.PostalCode = PostalCode;

    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }

    @Override
    public String toString() {
        return  "Country : " + Country + "      State : " + State + "     City : " + City + "   Street : " + Street + "   PostalCode : " + PostalCode + "\n";
    }
    
    
}
