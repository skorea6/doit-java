package section5.ch03;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerID(10010);
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());


        /**
         * 하위 클래스(VIP Customer)를 생성하면 상위 클래스(Customer)가 먼저 생성 됨
         * 클래스가 상속 받은 경우 하위 클래스의 생성자에서는 반드시 '상위 클래스의 생성자'를 호출 함
         */
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신"); // Customer() 생성자 먼저 호출
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        // 형 변환 (업캐스팅)
        // -> 상위 클래스(Customer)로 변수를 선언하고 하위 클래스(VIPCustomer)의 생성자로 인스턴스를 생성
        // -> 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능함
        Customer customerPark = new VIPCustomer(10021, "박유신");
        customerPark.bonusPoint = 10000;
        System.out.println(customerPark.showCustomerInfo());
        // 단, agentID, salesRatio는 가져올 수 없음.
        // customerPark.getAgentID() => 불가능.
        // 변수의 타입이 Customer 이므로 Customer 클래스의 멤버 변수와 메소드만 사용 가능.




    }
}
