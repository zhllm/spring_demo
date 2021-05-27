package com.be.self.proxy;

public class JdkHandlerTest {
    public static void main(String[] args) {

        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        You you = new You();
        JdkHandler jdkHandler = new JdkHandler(you);
        Marry marry = (Marry) jdkHandler.getProxy();
        marry.toMarry();
    }
}
