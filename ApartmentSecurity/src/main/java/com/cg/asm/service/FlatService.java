package com.cg.asm.service;

import java.util.List;

import com.cg.asm.entity.Flat;
import com.cg.asm.exception.RecordNotFoundException;

public interface FlatService {
	
	public Flat add(Flat flat) throws RecordNotFoundException;
	
	public Flat update(Flat flat) throws RecordNotFoundException;
	
	public Flat delete(Flat flat) throws RecordNotFoundException;
	
	public List<Flat> findByOwnerName(String name) throws RecordNotFoundException;
	
	public Flat findById(int flatId) throws RecordNotFoundException;
	
	public Flat search(Flat flat) throws RecordNotFoundException;
	

}
