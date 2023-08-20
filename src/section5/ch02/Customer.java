package section5.ch02;

public class Customer {
    protected int customerID;
    protected String customerName; // protected : 외부 클래스는 접근 할 수 없지만, 같은 패키지내 하위 클래스는 접근 할 수 있도록함
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(int customerID, String customerName, int bonusPoint) {
        System.out.println("Customer() 생성자 호출");
        this.customerID = customerID;
        this.customerName = customerName;
        this.bonusPoint = bonusPoint;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다";
    }
}

