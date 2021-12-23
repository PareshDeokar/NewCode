package com.cg.asm.service;

import java.util.List;

import com.cg.asm.entity.GuardSalary;
import com.cg.asm.exception.RecordNotFoundException;

public interface GuardSalaryService {
	

	public GuardSalary add(GuardSalary guardSalary)  throws RecordNotFoundException;
	
	public GuardSalary update(GuardSalary guardSalary)  throws RecordNotFoundException;
	
	public GuardSalary delete(GuardSalary guardSalary) throws RecordNotFoundException;
	
	public List<GuardSalary> findByName(String name) throws RecordNotFoundException;
	
	public GuardSalary findById(int guardSalaryId) throws RecordNotFoundException;

	public GuardSalary search(GuardSalary guardSalary) throws RecordNotFoundException;
	
	

}
