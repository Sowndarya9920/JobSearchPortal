package com.geekster.JobSearchPortal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @NotEmpty
    @Column(name = "title")
    private String title;
    @NotNull
    @Column(name = "description")
    private String description;
    @Column(name = "location")
    private String location;
    @Column(name = "salary")
    private Double salary;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "employer_name")
    private String employerName;
    @Column(name = "job_type")
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    @Column(name ="applied_date")
    private Timestamp appliedDate;

}
