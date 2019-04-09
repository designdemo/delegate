package com.delegate.simple;

/**
 * author:曲终、人散
 * Date:2019/4/9 21:57
 */
public class EmployeeA implements IEmployee {
    @Override
    public void work(String command) {
        System.out.println("我是员工A，我擅长加密的工作，开始执行："+ command);
    }
}
