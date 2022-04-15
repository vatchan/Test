import java.sql.Date;

public class Customer {
    private String customerName;
    private long customerPhoneNo;
    private String customerAddress;
    private Date customerDOB;
    public Customer()
    {

    }

    public Customer(String customerName, long customerPhoneNo, String customerAddress, Date customerDOB) {
        this.customerName = customerName;
        this.customerPhoneNo = customerPhoneNo;
        this.customerAddress = customerAddress;
        this.customerDOB = customerDOB;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerPhoneNo=" + customerPhoneNo +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerDOB=" + customerDOB +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(long customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Date getCustomerDOB() {
        return customerDOB;
    }

    public void setCustomerDOB(Date customerDOB) {
        this.customerDOB = customerDOB;
    }


}
