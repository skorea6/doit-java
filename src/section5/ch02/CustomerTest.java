package section5.ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "손흥민", 1000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김민재", 10000);
        System.out.println(customerKim.showCustomerInfo());
    }
}
