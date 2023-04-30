package com.geekster.JobSearchPortal.service;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.repository.IJobDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    IJobDao jobDao;

    /* Task : 1 --> using in-build crud repository */
    public String insertJobs(List<Job> jobs) {
        Iterable<Job> jobList = jobDao.saveAll(jobs);
        if(jobList!=null)
            return "Jobs were added";
        else
            return "Failed to insert Jobs";
    }



    /* Task :2 --> using custom finder */
    public List<Job> getByTitle(String title  , String description) {
        return jobDao.findByTitleAndDescription(title,description);
    }


    /* Task : 3 --> using custom query */
    @Transactional
    public void deleteJobByLocation(String location) {
        jobDao.deleteJobByLocation(location);
    }
    @Transactional
    public void updateJob(Long id, Double salary) {
        jobDao.updateJobByJobType(id,salary);
    }
}
