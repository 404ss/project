//声明自定义异常
import java.io.*;

public class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number = number;
    }
    //存钱
    public void deposit(double amount){
        balance += amount;
    }
    //取钱
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount){
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }
    //查询余额
    public double getBalance(){
        return balance;
    }
     //查询账号
    public int getNumber(){
        return number;
    }
}