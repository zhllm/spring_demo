package com.be.self;

import com.be.self.service.AccountService;
import com.be.self.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.test();

        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.test();
    }
}
