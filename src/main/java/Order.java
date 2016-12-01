import java.util.Arrays;
import java.util.Date;

/**
 * Created by eishkinina on 25.07.16.
 */
public class Order {
    private int orderID;
    private Book [] orderListOfBooks;
    private Customer customer;
    private Date dateOfBuying;
    private int priceOfOrder;

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDateOfBuying() {
        return dateOfBuying;
    }

    public int getPriceOfOrder() {
        return priceOfOrder;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPriceOfOrder(int priceOfOrder) {
        this.priceOfOrder = priceOfOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderListOfBooks=" + Arrays.toString(orderListOfBooks) +
                ", customer=" + customer +
                ", dateOfBuying=" + dateOfBuying +
                ", priceOfOrder=" + priceOfOrder +
                '}';
    }

    public void setDateOfBuying(Date dateOfBuying) {
        this.dateOfBuying = dateOfBuying;
    }

    public Order(int orderID, Book[] orderListOfBooks, Customer customer, Date dateOfBuying, int priceOfOrder) {
        this.orderID = orderID;
        this.orderListOfBooks = orderListOfBooks;
        this.customer = customer;
        this.dateOfBuying = dateOfBuying;
        this.priceOfOrder = priceOfOrder;
    }

    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
    }
}
