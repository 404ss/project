//多态虚函数
public class VirtualFunctionSalary extends VirtualFunctionEmployee {
    private double salary;
    public VirtualFunctionSalary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }
    public void mailCheck() {
        System.out.println("Salary mailCheck");
        System.out.println("Mailing a check to " + this.getName() + "Salary is " + this.salary);
    }
     public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        }
    }
    public double computePay() {
        System.out.println("Computing pay for " + this.getName());
        return salary / 52;
    }
}
