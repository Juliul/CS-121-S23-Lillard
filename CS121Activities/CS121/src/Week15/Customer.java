package Week15;

public class Customer {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String license;
    private int age;
    public Customer(String firstName, String lastName, String phone, String email,
                    String license, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.license = license;
        this.age = age;
    }
    public String getCustomerInfo() {
        return String.format("Name: %s %s\n" +
                        "Phone: %s\n" +
                        "Email: %s\n" +
                        "License: %s\n" +
                        "Age: %d\n",
                firstName, lastName, phone, email, license, age);
    }
    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}

