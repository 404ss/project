//多态虚函数
public class VirtualFunctionDemo {
    public static void main(String[] args) {
        VirtualFunctionSalary s = new VirtualFunctionSalary("John Doe", "123 Main St", 123456, 50000.00);
        VirtualFunctionEmployee e = new VirtualFunctionSalary("Tom", "456 Main St", 654321, 60000.00);
        System.out.println("使用Salary的引用调用mailCheck方法");
        s.mailCheck();
        System.out.println("使用Employee的引用调用mailCheck方法");
        e.mailCheck();
    }
}
