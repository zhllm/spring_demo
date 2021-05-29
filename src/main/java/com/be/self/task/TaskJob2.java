package com.be.self.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TaskJob2 {
    private SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");

    /**
     * 定义定时方法
     */
    // @Scheduled(cron = "0/2 * * * * ?")
    public void job1() {
        System.out.println("任务3 :" + format.format(new Date()));
    }

    // @Scheduled(cron = "0/5 * * * * ?")
    public void job2() {
        System.out.println("任务4 :" + format.format(new Date()));
    }


}
