import java.sql.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
      Customer customer = null;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of Customers:");
        LinkedList<Customer> listOfCustomers= new LinkedList<>();
      int count = sc.nextInt();
      while(count>0) {
          System.out.println("Enter Name:");
          String customerName = sc.next();
          System.out.println("Enter number:");
          long customerPhoneNo = sc.nextLong();
          System.out.println("Enter Address:");
          String customerAddress = sc.next();
          System.out.println("Enter DOB:");
          long dob = Long.parseLong(sc.next());
          Date customerDOB = new Date(dob);
          customer = new Customer(customerName, customerPhoneNo, customerAddress, customerDOB);
          listOfCustomers.add(customer);
          count--;
      }
      for(Customer cust : listOfCustomers)
      {
          System.out.println("****************************");
          System.out.println(cust.toString());
          System.out.println("****************************");
      }
      for(Customer cust : listOfCustomers)
      {
          if(cust.getCustomerName().equals("Francis"))
          {
              System.out.println("Fired");
          }
      }
      System.out.println("End of Program");
    }
}
