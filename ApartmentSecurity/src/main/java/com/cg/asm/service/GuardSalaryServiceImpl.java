package com.cg.asm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.asm.entity.Flat;
import com.cg.asm.entity.GuardSalary;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.repository.GuardSalaryDao;

@Service("GuardSalaryService")
public class GuardSalaryServiceImpl implements GuardSalaryService{
	
	@Autowired
	GuardSalaryDao guardSalaryDao;

	@Override
	public GuardSalary add(GuardSalary guardSalary) throws RecordNotFoundException {
		guardSalaryDao.saveAndFlush(guardSalary);
		return guardSalary;
	}

	@Override
	public GuardSalary update(GuardSalary guardSalary) throws RecordNotFoundException {
		GuardSalary bean = null;
		try {
			bean = guardSalaryDao.findById(guardSalary.getGuardSalaryId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Salary details not found!");
		}
		guardSalaryDao.saveAndFlush(guardSalary);
		return bean;
	}

	@Override
	public GuardSalary delete(GuardSalary guardSalary) throws RecordNotFoundException {
		GuardSalary bean = null;
		try {
			bean = guardSalaryDao.findById(guardSalary.getGuardSalaryId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Salary details not found!");
		}
		guardSalaryDao.deleteById(guardSalary.getGuardSalaryId());
		return bean;
	}

	@Override
	public List<GuardSalary> findByName(String name) throws RecordNotFoundException {
		List<GuardSalary> guardSalaries = new ArrayList<>();
		try {
			for(GuardSalary i :guardSalaryDao.findAll()) {
				if(i.getName().equals(name)) {
					guardSalaries.add(i);
				}
			}
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Salary details not found!");
		}
		return guardSalaries;
	}

	@Override
	public GuardSalary findById(int guardSalaryId) throws RecordNotFoundException {
		GuardSalary bean = null;
		try {
			bean = guardSalaryDao.findById(guardSalaryId).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Salary details not found!");
		}
		return bean;
	}

	@Override
	public GuardSalary search(GuardSalary guardSalary) throws RecordNotFoundException {
		GuardSalary bean = null;
		try {
			bean = guardSalaryDao.findById(guardSalary.getGuardSalaryId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Salary details not found!");
		}
		return bean;
	}

}
