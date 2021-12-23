package com.cg.asm.service;

import java.util.List;

import com.cg.asm.entity.Security;
import com.cg.asm.exception.RecordNotFoundException;

public interface SecurityService {
	
	public Security add(Security security) throws RecordNotFoundException;
	
	public Security update(Security security) throws RecordNotFoundException;
	
	public Security delete(Security security)throws RecordNotFoundException;
	
	public Security findById(int securityId)throws RecordNotFoundException;
	
	public Security search(Security security)throws RecordNotFoundException;
	

}
