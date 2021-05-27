package com.be.self.proxy;

public class StaticProxy {

    public static void main(String[] args) {
        You you = new You();

        MarryCompany marryCompany = new MarryCompany(you);

        marryCompany.toMarry();
    }

}
