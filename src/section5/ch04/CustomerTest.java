package section5.ch04;

public class CustomerTest {
    public static void main(String[] args) {
        int price = 10000;

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int cost = customerLee.calcPrice(price);
        System.out.println(customerLee.showCustomerInfo() + " 지불 금액은 " + cost + "입니다.");

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        cost = customerKim.calcPrice(price);
        System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " + cost + "입니다.");

        // 업캐스팅이 일어나도 calcPrice 하면 VIPCustomer(하위클래스)의 오버라이딩된것들이 불려짐.
        // customerPark 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 임
        // 자바에서는 항상 인스턴스의 메서드가 호출 됨 (가상메서드의 원리) 자바의 모든 메서드는 가상 메서드(virtual method) 임
        Customer customerPark = new VIPCustomer(10021, "Park");
//        customerPark.getAgentID(); // 하위 클래스에서만 정의된 메소드는 가져올 수 없다.
        customerPark.bonusPoint = 10000;
        cost = customerPark.calcPrice(price); // 이거랑
        System.out.println(customerPark.showCustomerInfo() + " 지불 금액은 " + cost + "입니다."); // 이거 오버라이딩된거
    }
}
