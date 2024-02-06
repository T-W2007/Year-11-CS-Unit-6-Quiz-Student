public class Address {
    public static String district;
    public static String street;
    public static int streetNumber;

    public Address(String district, String street, int streetNumber) {
        this.district = district;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }


    public String toString() {
        return streetNumber + " " + street + ", " + district;
    }



}
