package com.delegate.simple;

/**
 * author:曲终、人散
 * Date:2019/4/9 21:57
 */
public class EmployeeB implements IEmployee {
    @Override
    public void work(String command) {
        System.out.println("我是员工B，我擅长架构的工作，开始执行："+ command);
    }
}
