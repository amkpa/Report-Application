package com.report.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.report.entity.Citizien_Plan;

@Service
public interface Citizien_repo extends JpaRepository<Citizien_Plan, Integer> {
	
	@Query("select distinct(planName) from Citizien_Plan")
	List<String>getplanname();
	
	@Query("select distinct(planstatus) from Citizien_Plan")
	List<String>getplanstatus();

}
