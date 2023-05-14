package com.learn.schedular.appstatusschedular.schedular;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AppStatusChecker {

    //@Scheduled(fixedDelay = 1000)
    @Async
    @Scheduled(cron = "*/10 * * * * *")
    public void checkStatus() throws InterruptedException {

        System.out.println("am running");
       // Thread.sleep(5000);
        System.out.println("am after wait");
    }



}
