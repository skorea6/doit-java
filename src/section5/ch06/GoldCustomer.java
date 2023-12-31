package section5.ch06;

public class GoldCustomer extends Customer{
    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        System.out.println("GoldCustomer(int, String) 생성자 호출");
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
