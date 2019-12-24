package com.senior_web.customer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.senior_web.common.domin.Job;

import com.senior_web.common.service.JobService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class JobController {
    @Resource
    @Reference(version = "1.0.0")
    private JobService jobService;

    @GetMapping("getJobById")
    public Job getUserById(){
        System.out.println("job controller hit ");

        int id = 6;
        return jobService.getJobById(id);
    }
    @GetMapping("findList")
    public List<Job> findList(){
        System.out.println("job controller hit ");

        int startId = 6;
        int stopId = 100;
        List<Job> jobs = jobService.findList(startId,stopId);
        return jobs;
    }


//    @GetMapping("updateUser")
//    public void updateUser(){
//        System.out.println("进来了！！！！！！！！！！！！！！！！");
//        System.out.println(jobService.hashCode()+"!!!!!!!!!!!!!!!!");
//        Job job = new Job();
//        int i = jobService.updateJob(job);
//        System.out.println("是否保存成功？-------------"+i);
//    }

    @GetMapping("deleteJob")
    public void deleteUser(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(jobService.hashCode()+"!!!!!!!!!!!!!!!!");
        int id = 3;
        int i = jobService.deleteJob(id);
        System.out.println("是否保存成功？-------------"+i);
    }
}
