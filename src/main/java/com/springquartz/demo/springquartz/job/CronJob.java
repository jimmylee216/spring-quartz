package com.springquartz.demo.springquartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author hzb
 * @date 2018/08/28
 */
public class CronJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("=========================定时任务每5秒执行一次===============================");
        System.out.println("jobName=====:"+jobExecutionContext.getJobDetail().getKey().getName());
        System.out.println("jobGroup=====:"+jobExecutionContext.getJobDetail().getKey().getGroup());
        System.out.println("taskData=====:"+jobExecutionContext.getJobDetail().getJobDataMap().get("taskData"));
    }
}