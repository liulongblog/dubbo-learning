package com.minivision.dubbodemo.city.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务类，实现job接口
 */
public class CityTask implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        /*
        打印当前日期，实现伪闹钟功能
         */
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(new Date()));
    }
}
