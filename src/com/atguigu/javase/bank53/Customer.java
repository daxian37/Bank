package com.atguigu.javase.bank53;


/**
 * 1.修改 Customer 类，使其拥有两个账户:一个储蓄账户和一个支票账户:两个都是可选的。
 * 2.在练习 5_续 1 修改，原来的 Customer 类包含一个称作 account 的关联属性，
 *   可用该属性控制一个 Account 对象。
 *   重写这个类，使其包含两个关联属性:savingAccount 和 checkingAccount，
 *   这两个属性的缺省值是 null
 * 3.包含两个访问方法:getSaving 和 getChecking，这两个方法分别返回储蓄 和支票总数。
 * 4.包含两个相反的方法:SetSaving 和 setChecking，
 *   这两个方法分别为 savingAccount 和 checkingAccount 这两个关联属性赋值。
 **/



//在banking包下的创建Customer类。该类必须实现上面的UML图表中的模型。
public class Customer {


    // 声明三个私有对象属性:firstName、lastName 和 account。
    private String firstName;
    private String lastName;

    private SavingAccount savingsAccount;
    private CheckingAccount checkingAccount;

    // 声明一个公有构造器，这个构造器带有两个代表对象属性的参数(f 和 l)
    public Customer(String f, String l) {
        firstName = f;
        lastName = l;


    }

    // 声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName返回相应的属性。
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public SavingAccount getSavingsAccount() {
        return savingsAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }


    public void setSavingsAccount(SavingAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
}
