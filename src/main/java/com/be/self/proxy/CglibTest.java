package com.be.self.proxy;

public class CglibTest {

    public static void main(String[] args) {
        You you = new You();
        CglibInterceptor cglibInterceptor = new CglibInterceptor(you);
        Marry marry = (Marry) cglibInterceptor.getProxy();
        marry.toMarry();
    }
}
