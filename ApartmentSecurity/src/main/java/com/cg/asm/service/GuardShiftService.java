package com.cg.asm.service;

import java.util.List;

import com.cg.asm.entity.GuardShift;
import com.cg.asm.exception.RecordNotFoundException;

public interface GuardShiftService {
	
	public GuardShift add( GuardShift guardShift) throws RecordNotFoundException;
	
	public GuardShift update( GuardShift guardShift) throws RecordNotFoundException;
	
	public GuardShift delete( GuardShift guardShift) throws RecordNotFoundException;
	
	public List<GuardShift> findByName(String name) throws RecordNotFoundException;
	
	public GuardShift findById(int guardShiftId) throws RecordNotFoundException;
	
	public GuardShift search(GuardShift guardShift) throws RecordNotFoundException;
	
	

}
