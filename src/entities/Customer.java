package entities;

public class Customer extends User implements Entity {
    private String firstName;
    private String lastName;
    private String nationalityIdentity;

    public Customer(int id, String userName, String password, String email, String firstName, String lastName, String nationalityIdentity) {
        super(id, userName, password, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityIdentity = nationalityIdentity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityIdentity() {
        return nationalityIdentity;
    }

    public void setNationalityIdentity(String nationalityIdentity) {
        this.nationalityIdentity = nationalityIdentity;
    }
}
