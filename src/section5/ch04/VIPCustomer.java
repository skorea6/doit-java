package section5.ch04;

// VIPCustomer 는 이미 Customer 에 구현된 내용이 중복되므로 Customer 를 확장하여 구현함 (상속)
public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    // 상위 클래스의 기본 생성자가 없는 경우 ( 다른 생성자가 있는 경우 ) 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출 함
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName); // 상위 클래스에 기본 생성자가 있으면 super() 호출 안해도 자동으로 넣어줌.

//        System.out.println("VIPCustomer(int, String) 생성자 호출");
        customerGrade = "VIP";    //오류 발생 private->protected 로 해결
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    /**
     - 메소드 오버라이딩 (overriding)
     - 오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음
     - 재정의
     - 단축키 Ctrl + O
     */
    @Override // 어노테이션 (오버라이딩한 메소드가 맞는지 체크해준다. int price 를 double price 로 바꾸면 오류가 생기게끔 해주는거) , 선언부가 기존의 메서드와 다른 경우 에러가 남
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 상담원 아이디는 " + agentID;
    }
}
