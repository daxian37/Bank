package com.atguigu.javase.bank53;


/**
 * 1.CheckingAccount 类必须扩展 Account 类
 * 2.该类必须包括一个关联属性，称作 protectedBy，表示透支保护。该属性的 类型为 SavingAccount，缺省值必须是 null。除此之外该类没有其他的数据属 性。
 * 3.该类必须包括一个带有参数(balance)的公有构造器，该构造器必须通过调 用 super(balance)将 balance 参数传递到父类构造器。
 * 4.修 改 构 造 器 为 CheckingAccount(double balance,SavingAccount protect)构造器。该构造器必须通过调用 super(balance)将 balance 参数 传递给父类构造器。
 * 5.CheckingAccount 类必须覆盖 withdraw 方法。
 *   该类必须执行下面的检查: 如果当前余额足够弥补取款 amount，则正常进行。
 *   如果不够弥补但是存在透支保护
 *   则尝试用储蓄账户来弥补这个差值(balance-amount)。
 *   如果后一个交易失败，则整个交易一定失败，但余额未受影响。
 * **/
public class CheckingAccount extends Account {

    // 2.该类必须包括一个关联属性，称作 protectedBy，表示透支保护。该属性的 类型为 SavingAccount，缺省值必须是 null。除此之外该类没有其他的数据属 性。
    private SavingAccount protectedBy;

    //3.该类必须包括一个带有参数(balance)的公有构造器，该构造器必须通过调 用 super(balance)将 balance 参数传递到父类构造器。
    public CheckingAccount(double init_balance) {
        super(init_balance);
    }
    //4.修 改 构 造 器 为 CheckingAccount(double balance,SavingAccount protect)构造器。该构造器必须通过调用 super(balance)将 balance 参数 传递给父类构造器。
    public CheckingAccount(double init_balance, SavingAccount protectedBy) {
        super(init_balance);
        this.protectedBy = protectedBy;
    }



    // 5.CheckingAccount 类必须覆盖 withdraw 方法。
    //   该类必须执行下面的检查: 如果当前余额足够弥补取款 amount，则正常进行。
    //   如果不够弥补但是存在透支保护
    //   则尝试用储蓄账户来弥补这个差值(balance-amount)。
    //   如果后一个交易失败，则整个交易一定失败，但余额未受影响。

    @Override
    public boolean withdraw(double amt){

        //余额足够
        if(balance >= amt){
            balance -=amt;
        }else{
            //透支保护足够
            if(protectedBy != null && protectedBy.getBalance() >= (amt - balance)) {
                protectedBy.withdraw(amt - balance);
                balance = 0;
            }else{
                return false;

            }
        }
        return true;
    }


}
