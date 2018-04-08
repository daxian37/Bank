package com.atguigu.javase.bank7;

/**
 * 1. 在 banking.domain 包中建立一个共有类 OverdraftException. 这个类扩展 RuntimeException 类。
 * 2. 添加一个 double 类型的私有属性 deficit.增加一个共有访问方法 getDeficit
 * 3. 添加一个有两个参数的共有构造器。deficit 参数初始化 deficit 属性
**/



public class OverdraftException extends RuntimeException{
    private double deficit;

    public double getDeficit (){
        return deficit ;
    }

    public OverdraftException(String msg,double deficit){
        super(msg);
        this.deficit = deficit;
    }



}
