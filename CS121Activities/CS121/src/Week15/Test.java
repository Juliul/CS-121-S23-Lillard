package Week15;

public class Test {
    public static void main(String[] args) {
        CustomerRecord HotTopic = new CustomerRecord();

        HotTopic.addCustomer(new Customer("Robin", "Dell", "555-1234", "robinDell@gmail.com", "ABC123", 30));
        HotTopic.addCustomer(new Customer("Julius", "Lillard","123-4321", "Julius@gmail.com", "GIN666", 19));

        System.out.println(HotTopic.getAllCustomersInfo());
    }
}
