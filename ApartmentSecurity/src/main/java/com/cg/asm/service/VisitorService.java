package com.cg.asm.service;

import java.util.List;

import com.cg.asm.entity.Visitor;
import com.cg.asm.exception.RecordNotFoundException;

public interface VisitorService {
	
	public Visitor add(Visitor visitor)throws RecordNotFoundException;
	
	public Visitor update(Visitor visitor)throws RecordNotFoundException;
	
	public Visitor delete(Visitor visitor)throws RecordNotFoundException;
	
	public List<Visitor> findByName(String name)throws RecordNotFoundException;
	
	public Visitor findById(int visitorId)throws RecordNotFoundException;
	
	public Visitor search(Visitor visitor)throws RecordNotFoundException;
	

}
