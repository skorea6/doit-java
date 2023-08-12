package section3.ch14;

public class Employee {
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;

    public Employee()
    {
        employeeId = ++serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
//        int i = 0; // 지역 변수
//        this.employeeName = "Lee";  //오류발생 => 인스턴스 호출전이기 때문에
        Employee.serialNum = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
