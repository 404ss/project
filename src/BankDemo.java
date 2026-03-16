//声明自定义异常
public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(123456);
        System.out.println("账号："+account.getNumber());
        System.out.println("存入1000元");
        account.deposit(1000);
        System.out.println("当前余额："+account.getBalance());
        try {
            System.out.println("取出500元");
            account.withdraw(500);
            System.out.println("取出2000元");
            account.withdraw(2000);
        }catch (InsufficientFundsException e){
            System.out.println("余额不足，无法取出"+e.getAmount()+"元");
        }
        System.out.println("当前余额："+account.getBalance());
    }
}