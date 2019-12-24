package com.senior_web.common.service;

import com.senior_web.common.domin.Job;

import java.util.List;

public interface JobService {

    Job getJobById(int id);
//    List<Job> findSet(int start_id,int stop_id);
        List<Job> findList(int startId,int stopId);

    int updateJob(Job user);
    int deleteJob(int id);
}

