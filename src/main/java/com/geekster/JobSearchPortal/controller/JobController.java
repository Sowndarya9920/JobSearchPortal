package com.geekster.JobSearchPortal.controller;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.JobType;
import com.geekster.JobSearchPortal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    /* Task: 1 --> using in-build crud repository */

    @PostMapping(value = "/addJobs")
    public String insertJobs(@Valid @RequestBody List<Job> jobs){
        return jobService.insertJobs(jobs);

    }

    /* Task: 2 --> using custom finders */

    @GetMapping(value = "/getJobByTitle/{title}/{description}")
    public List<Job> getJobByTitle(@PathVariable String title , @PathVariable String description){
        return jobService.getByTitle(title,description);
    }



   /* Task : 3 --> using custom query */

    @DeleteMapping(value = "/delete/location/{location}")
    public void deleteJobByLocation(@PathVariable String location){
        jobService.deleteJobByLocation(location);
    }

    @PutMapping(value = "/updateJob/{id}/{salary}")
    public void updateJob(@PathVariable Long id , @PathVariable Double salary){
        jobService.updateJob(id,salary);
    }

}
