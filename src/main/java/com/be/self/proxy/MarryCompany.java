package com.be.self.proxy;

public class MarryCompany implements Marry{
    private Marry marry;

    public MarryCompany(Marry marry) {
        this.marry = marry;
    }

    @Override
    public void toMarry() {
        before();

        marry.toMarry();

        after();
    }

    private void before() {
        System.out.println("婚礼布置中");
    }

    private void after() {
        System.out.println("婚礼结束");
    }
}
