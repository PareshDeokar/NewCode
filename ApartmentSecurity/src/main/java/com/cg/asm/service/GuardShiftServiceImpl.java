package com.cg.asm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.asm.entity.GuardSalary;
import com.cg.asm.entity.GuardShift;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.repository.GuardShiftDao;

@Service("GuardShiftService")
public class GuardShiftServiceImpl implements GuardShiftService{
	
	@Autowired
	GuardShiftDao guardShiftDao;

	@Override
	public GuardShift add(GuardShift guardShift) throws RecordNotFoundException {
		guardShiftDao.saveAndFlush(guardShift);
		return guardShift;
	}

	@Override
	public GuardShift update(GuardShift guardShift) throws RecordNotFoundException {
		GuardShift bean = null;
		try {
			bean = guardShiftDao.findById(guardShift.getGuardShiftId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Shift details not found!");
		}
		guardShiftDao.saveAndFlush(guardShift);
		return bean;
	}

	@Override
	public GuardShift delete(GuardShift guardShift) throws RecordNotFoundException {
		GuardShift bean = null;
		try {
			bean = guardShiftDao.findById(guardShift.getGuardShiftId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Shift details not found!");
		}
		guardShiftDao.deleteById(guardShift.getGuardShiftId());
		return bean;
	}

	@Override
	public List<GuardShift> findByName(String name) throws RecordNotFoundException {
		List<GuardShift> guardShifts = new ArrayList<>();
		try {
			for(GuardShift i :guardShiftDao.findAll()) {
				if(i.getName().equals(name)) {
					guardShifts.add(i);
				}
			}
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Shift details not found!");
		}
		return guardShifts;
	}

	@Override
	public GuardShift findById(int guardShiftId) throws RecordNotFoundException {
		GuardShift bean = null;
		try {
			bean = guardShiftDao.findById(guardShiftId).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Shift details not found!");
		}
		return bean;
	}

	@Override
	public GuardShift search(GuardShift guardShift) throws RecordNotFoundException {
		GuardShift bean = null;
		try {
			bean = guardShiftDao.findById(guardShift.getGuardShiftId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guard Shift details not found!");
		}
		return bean;
	}

}
