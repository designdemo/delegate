package com.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * author:曲终、人散
 * Date:2019/4/9 21:55
 */
public class Leader implements IEmployee{

    private static Map<String,IEmployee> headle = new HashMap<>();

    public Leader() {
        headle.put("加密",new EmployeeA());
        headle.put("架构",new EmployeeB());
    }

    public void work(String command) {
        headle.get(command).work(command);
    }
}
