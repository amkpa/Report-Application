package com.report.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
@Table(name = "Citizien_Plan")
public class Citizien_Plan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String gender;
	private String planName;
	private String planstatus;
	private LocalDate start_date;
	private LocalDate end_date;
	private double benifit_ammount;
	private String denial_reason;
	private String termination_reason;
	private LocalDate termination_date;
	
}
