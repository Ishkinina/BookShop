/**
 * Created by eishkinina on 25.07.16.
 */
public class Customer {
    private String nameOfCustomer;
    private String surnameOfCustomer;
    protected int customerID;

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public String getSurnameOfCustomer() {
        return surnameOfCustomer;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public void setSurnameOfCustomer(String surnameOfCustomer) {
        this.surnameOfCustomer = surnameOfCustomer;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Customer(int customerID) {
        this.customerID = customerID;
    }

    public Customer(int customerID, String surnameOfCustomer) {
        this.customerID = customerID;
        this.surnameOfCustomer = surnameOfCustomer;
    }

}
