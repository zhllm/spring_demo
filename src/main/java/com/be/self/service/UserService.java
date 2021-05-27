package com.be.self.service;

import com.be.self.dao.IUserDao;
import com.be.self.dao.UserDao;

import javax.annotation.Resource;

/**
 * @Resource 注解实现自动注入（反射）
 * 1。注解默认通过字段名查找对应的bean对象（属性名称和bean的id一致）
 * 2。如果字段名和id不一致则会通过类型（class）查找
 * 3。属性字段的set方法是可选的
 * 4。注解可以声明在字段上，也能声明在set方法上
 * 5。也能在注解参数中传递bean的id去查找bean
 * 6。当注入的是接口，当接口只有一个实现类，则可正常实例化，否则需要通过注解的参数name指明注入的类型
 */
public class UserService {

    //  @Resource(name = "userDao")
    @Resource
    public UserDao userDao;

    // @Resource(name = "userDaoIml01")
    @Resource(name = "userDaoIml02")
    private IUserDao iUserDao;

    public void test() {
        System.out.println("UserService Test.....");
        userDao.test();
        iUserDao.test();
    }

}

