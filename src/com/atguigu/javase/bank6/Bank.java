package com.atguigu.javase.bank6;

/**
 * 提示:
 * 对银行来说，可添加 Bank 类。 Bank 对象跟踪自身与其客户间的关系。用 Customer 对象的数组实现这个集合化的关系。还要保持一个整数属性来跟踪 银 行当前有多少客户。
 * bankpeoject6
 *1. 修改 Bank 类，创建名为 getBanking 的公有静态方法，它返回一个 Bank类的实例。
 *2. 单个的实例应是静态属性，且为私有。同样，Bank 构造器也应该是私有的


 **/

//创建 Bank 类
public class Bank {

    // 为 Bank 类 增 加 两 个 属 性 : customers(Customer对象的数组 )
    // 和numberOfCustomers(整数，跟踪下一个 customers 数组索引)

    private Customer[] customers;
    private int numberOfCustomers;

    //添加公有构造器，以合适的最大尺寸(至少大于 5)初始化 customers 数组。
    public Bank() {
        customers = new Customer[10];

    }
    private static Bank bank = new Bank();

    public static Bank getBank(){
        return bank;
    }

    // d. 添加 addCustomer 方法。该方法必须依照参数(姓，名)构造一个新的 Customer
    // 对象然后把它放到 customer 数组中。
    // 还必须把 numberofCustomers 属性的值加 1。

    public void addCustomer(String f,String l){

        Customer customer = new Customer(f, l);
        customers[numberOfCustomers] =customer;
        numberOfCustomers++;
    }


    // e. 添加 getNumOfCustomers 访问方法，它返回 numberofCustomers 属 性值。


    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    // f. 添加 getCustomer方法。它返回与给出的index参数相关的客户。

    public Customer getCustomer(int index) {
        return customers[index];
    }

   // 6-1. 修改 Bank 类，创建名为 getBanking 的公有静态方法，它返回一个 Bank类的实例。
    public void getBanking(){

    }
}
