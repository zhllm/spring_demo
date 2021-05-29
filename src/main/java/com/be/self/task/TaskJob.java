package com.be.self.task;


import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TaskJob {
    private SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");

    /**
     * 定义定时方法
     */
    public void job1() {
        System.out.println("任务1 :" + format.format(new Date()));
    }

    public void job2() {
        System.out.println("任务2 :" + format.format(new Date()));
    }


}
