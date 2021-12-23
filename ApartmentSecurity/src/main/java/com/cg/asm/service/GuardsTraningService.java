package com.cg.asm.service;

import java.util.List;

import com.cg.asm.entity.GuardsTraning;
import com.cg.asm.exception.RecordNotFoundException;

public interface GuardsTraningService {
	
	public GuardsTraning add(GuardsTraning guardsTraning) throws RecordNotFoundException;
	
	public GuardsTraning update(GuardsTraning guardsTraning)throws RecordNotFoundException;
	
	public GuardsTraning delete(GuardsTraning guardsTraning)throws RecordNotFoundException;
	
	public List<GuardsTraning> findByName(String name)throws RecordNotFoundException;
	
	public GuardsTraning findById(int guardsTraningId)throws RecordNotFoundException;
	
	public GuardsTraning search(GuardsTraning guardsTraning)throws RecordNotFoundException;
	

}
