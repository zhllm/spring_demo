package com.be.self;

import com.be.self.service.UserService;
import com.be.self.task.TaskJob;
import com.be.self.task.TaskJob2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.test();

        TaskJob taskJob = (TaskJob) context.getBean("taskJob");
        TaskJob2 taskJob2 = (TaskJob2) context.getBean("taskJob2");
    }
}
