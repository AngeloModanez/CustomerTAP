package entity;

public class Customer {
    public enum Gender {
        M, F
    }

    private int CustomerID;
    private String Customer;
    private String State;
    private Gender Gender;
    private String Status;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender gender) {
        Gender = gender;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}