import java.time.Year;

public class DrivingLicense {

    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseNumber;
    private int yearOfIssue;
    private String drivingLicenseCategory;

    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "DrivingLicense [name=" + name + ", surname=" + surname + ", address=" + address + ", postalCode="
                + postalCode + ", city=" + city + ", drivingLicenseNumber=" + drivingLicenseNumber + ", yearOfIssue="
                + yearOfIssue + ", drivingLicenseCategory=" + drivingLicenseCategory + "]";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if ((yearOfIssue < 1980) || (yearOfIssue > 2022)){
            System.out.println("wrong date");
        }
        else {
            this.yearOfIssue = yearOfIssue;
        }
    }

    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getDrivingLicenseCategory() {
        return drivingLicenseCategory;
    }

    public void display() {
        System.out.println(name + " " + surname + "\n");
        System.out.println(address + " " + postalCode + " " + city + '\n');
        System.out.println(drivingLicenseNumber + " " + yearOfIssue + " " + drivingLicenseCategory);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName.substring(0, 1).toUpperCase() + newName.substring(1);
    }
}
