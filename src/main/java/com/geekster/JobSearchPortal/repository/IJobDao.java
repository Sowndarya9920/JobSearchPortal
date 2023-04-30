package com.geekster.JobSearchPortal.repository;

import com.geekster.JobSearchPortal.model.Job;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobDao extends CrudRepository<Job,Long> {

    /* custom finder */
    public List<Job> findByTitleAndDescription(String title , String description);

    /* custom query */
    @Modifying
    @Query(value = "delete from JOB where LOCATION = :location", nativeQuery = true)
    public void deleteJobByLocation(String location);

    @Modifying
    @Query(value = "update JOB set SALARY = :salary where ID = :id" , nativeQuery = true)
    public void updateJobByJobType(Long id, Double salary);
}
