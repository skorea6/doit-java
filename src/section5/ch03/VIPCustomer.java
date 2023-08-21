package section5.ch03;

// VIPCustomer 는 이미 Customer 에 구현된 내용이 중복되므로 Customer 를 확장하여 구현함 (상속)
public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    // 상위 클래스의 기본 생성자가 없는 경우 ( 다른 생성자가 있는 경우 ) 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출 함
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName); // 상위 클래스에 기본 생성자가 있으면 super() 호출 안해도 자동으로 넣어줌.

        System.out.println("VIPCustomer(int, String) 생성자 호출");
        customerGrade = "VIP";    //오류 발생 private->protected 로 해결
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }
}
