package com.atguigu.javase.bank6;


/**
 * 创建 Account 类的两个子类:SavingAccount 和 CheckingAccount 子类
 a. 修改 Account 类;将 balance 属性的访问方式改为 protected
 b. 创建 SavingAccount 类，该类继承 Account 类
 c. 该类必须包含一个类型为 double 的 interestRate 属性
 d. 该类必须包括带有两个参数(balance 和 interest_rate)的公有构造器。该 构 造器必须通过调用
 *
 *
 * **/
public class SavingAccount extends Account {
    public double interestRate;
    public SavingAccount(double init_balance,double interestRate) {
        super(init_balance);
        this.interestRate = interestRate;
    }
}
