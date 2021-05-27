package com.be.self;

import com.be.self.controller.TypeController;
import com.be.self.dao.TypeDao;
import com.be.self.service.TypeService;
import com.be.self.utils.PropertyUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring02.xml");
        TypeDao typeDao = (TypeDao) context.getBean("typeDao");
        typeDao.test();

        TypeService typeService = (TypeService) context.getBean("typeService");
        typeService.test();

        TypeController typeController = (TypeController) context.getBean("typeController");
        typeController.test();

        PropertyUtil propertyUtil = (PropertyUtil) context.getBean("propertyUtil");
        propertyUtil.test();
    }
}
