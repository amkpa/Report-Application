package com.report.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.report.entity.Citizien_Plan;
import com.report.repo.Citizien_repo;

@Component
public class Dataloader implements ApplicationRunner {
	@Autowired
	private Citizien_repo repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//Cash Plan
		Citizien_Plan c1=	new Citizien_Plan();
		c1.setName("John");
		c1.setGender("male");
		c1.setPlanName("Cash");
		c1.setPlanstatus("Approved");
		c1.setStart_date(LocalDate.now());
		c1.setEnd_date(LocalDate.now().plusMonths(6));
		c1.setBenifit_ammount(5000.00);
		
		
		
		Citizien_Plan c2=	new Citizien_Plan();
		c2.setName("Rony");
		c2.setGender("male");
		c2.setPlanName("Cash");
		c2.setPlanstatus("Denied");
		c2.setDenial_reason("rental income");
		
		
		Citizien_Plan c3=	new Citizien_Plan();
		c3.setName("Reha");
		c3.setGender("female");
		c3.setPlanName("Cash");
		c3.setPlanstatus("Terminated");
		c3.setStart_date(LocalDate.now().minusMonths(4));
		c3.setEnd_date(LocalDate.now().plusMonths(6));
		c3.setTermination_date(LocalDate.now());
		c3.setTermination_reason("Employeed");
		
		// Food Plan
		
		Citizien_Plan c4=	new Citizien_Plan();
		c4.setName("Ron");
		c4.setGender("male");
		c4.setPlanName("Food");
		c4.setPlanstatus("Approved");
		c4.setStart_date(LocalDate.now());
		c4.setEnd_date(LocalDate.now().plusMonths(6));
		c4.setBenifit_ammount(4000.00);
		
		
		
		Citizien_Plan c5=	new Citizien_Plan();
		c5.setName("Smith");
		c5.setGender("male");
		c5.setPlanName("Food");
		c5.setPlanstatus("Denied");
		c5.setDenial_reason(" rental income");
		
		
		Citizien_Plan c6=	new Citizien_Plan();
		c6.setName("Lora");
		c6.setGender("female");
		c6.setPlanName("Food");
		c6.setPlanstatus("Terminated");
		c6.setStart_date(LocalDate.now().minusMonths(4));
		c6.setEnd_date(LocalDate.now().plusMonths(6));
		c6.setTermination_date(LocalDate.now());
		c6.setTermination_reason("Employeed");
		
		//Medical
		
		Citizien_Plan c7=	new Citizien_Plan();
		c7.setName("Rohit");
		c7.setGender("male");
		c7.setPlanName("Medical");
		c7.setPlanstatus("Approved");
		c7.setStart_date(LocalDate.now());
		c7.setEnd_date(LocalDate.now().plusMonths(6));
		c7.setBenifit_ammount(10000.00);
		
		
		
		Citizien_Plan c8=	new Citizien_Plan();
		c8.setName("Lucifier");
		c8.setGender("male");
		c8.setPlanName("Medical");
		c8.setPlanstatus("Denied");
		c8.setDenial_reason("rental income");
		
		
		Citizien_Plan c9=	new Citizien_Plan();
		c9.setName("snoew");
		c9.setGender("female");
		c9.setPlanName("Medical");
		c9.setPlanstatus("Terminated");
		c9.setStart_date(LocalDate.now().minusMonths(4));
		c9.setEnd_date(LocalDate.now().plusMonths(6));
		c9.setTermination_date(LocalDate.now());
		c9.setTermination_reason("Employeed");
		
		//Employment
		
		
		Citizien_Plan c10=	new Citizien_Plan();
		c10.setName("Kelvin");
		c10.setGender("male");
		c10.setPlanName("Employment");
		c10.setPlanstatus("Approved");
		c10.setStart_date(LocalDate.now());
		c10.setEnd_date(LocalDate.now().plusMonths(6));
		c10.setBenifit_ammount(5000.00);
		
		
		
		Citizien_Plan c11=	new Citizien_Plan();
		c11.setName("danny");
		c11.setGender("male");
		c11.setPlanName("Employment");
		c11.setPlanstatus("Denied");
		c11.setDenial_reason("rental income");
		
		
		Citizien_Plan c12=	new Citizien_Plan();
		c12.setName("Loren");
		c12.setGender("female");
		c12.setPlanName("Employment");
		c12.setPlanstatus("Terminated");
		c12.setStart_date(LocalDate.now().minusMonths(4));
		c12.setEnd_date(LocalDate.now().plusMonths(6));
		c12.setTermination_date(LocalDate.now());
		c12.setTermination_reason("Employeed");
		
		
		//Education
		
		Citizien_Plan c13=	new Citizien_Plan();
		c13.setName("Henery");
		c13.setGender("male");
		c13.setPlanName("Education");
		c13.setPlanstatus("Approved");
		c13.setStart_date(LocalDate.now());
		c13.setEnd_date(LocalDate.now().plusMonths(6));
		c13.setBenifit_ammount(5000.00);
		
		
		
		Citizien_Plan c14=	new Citizien_Plan();
		c14.setName("Mohit");
		c14.setGender("male");
		c14.setPlanName("Education");
		c14.setPlanstatus("Denied");
		c14.setDenial_reason("rental income");
		
		
		Citizien_Plan c15=	new Citizien_Plan();
		c15.setName("Rose");
		c15.setGender("female");
		c15.setPlanName("Education");
		c15.setPlanstatus("Terminated");
		c15.setStart_date(LocalDate.now().minusMonths(4));
		c15.setEnd_date(LocalDate.now().plusMonths(6));
		c15.setTermination_date(LocalDate.now());
		c15.setTermination_reason("Employeed");
		
		List<Citizien_Plan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15);
		repo.saveAll(list);
		
	}
	
	
	

}
