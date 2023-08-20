package section5.ch02;

// VIPCustomer 는 이미 Customer 에 구현된 내용이 중복되므로 Customer 를 확장하여 구현함 (상속)
public class VIPCustomer extends Customer{
    private int agentId;
    private double salesRatio;

    public VIPCustomer(int customerID, String customerName, int bonusPoint) {
        super(customerID, customerName, bonusPoint);
        System.out.println("VIPCustomer() 생성자 호출");
        customerGrade = "VIP";    //오류 발생 private->protected 로 해결
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }
}
