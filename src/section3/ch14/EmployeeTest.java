package section3.ch14;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
        System.out.println(Employee.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        System.out.println(Employee.getSerialNum());

        System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());

        System.out.println(Employee.getSerialNum());
        Employee.setSerialNum(1003);
        System.out.println(Employee.getSerialNum());
    }
}
