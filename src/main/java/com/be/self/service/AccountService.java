package com.be.self.service;

import com.be.self.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Autowired 自动注入
 * 1。注解模型使用类型（class）去匹配bean
 * 2。注解可以在属性字段上声明，也可以在set方法上声明
 * 3。set方法非必须
 * 4。如果显示指定bean的id，需要增加另一个注解@Qualifier 且value为bean的id
 */
public class AccountService {

    @Autowired
    @Qualifier(value = "accountDao")
    private AccountDao accountDao;

    public void test() {
        System.out.println("AccountService Test.....");
        accountDao.test();
    }
}
