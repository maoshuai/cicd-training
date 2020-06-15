package fast.coding.challenge.c5.wrap.parameter.object.after;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String areaCode;
    private final String city;
    private final String street;
    private final String address;
    private final String phoneNo;

    public Person(String firstName, String lastName, String areaCode, String city, String street, String address, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.areaCode = areaCode;
        this.city = city;
        this.street = street;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
