package com.be.self.controller;


import com.be.self.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TypeController {

    private TypeService typeService;

    @Autowired
    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public void test() {
        System.out.println("TypeController Test.....");
        typeService.test();
    }
}
