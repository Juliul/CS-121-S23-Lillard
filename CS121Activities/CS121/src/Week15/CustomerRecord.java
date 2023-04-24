package Week15;

import java.util.ArrayList;

public class CustomerRecord {
    private ArrayList<Customer> customers;

    public CustomerRecord() {
        customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public String getAllCustomersInfo() {
        StringBuilder stringB = new StringBuilder();
        for (Customer x : customers) {
            stringB.append(x.getCustomerInfo());
            System.out.println();
        }
        return stringB.toString();
    }
}

