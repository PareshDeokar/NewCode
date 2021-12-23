package com.cg.asm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.asm.entity.GuardShift;
import com.cg.asm.entity.GuardsTraning;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.repository.GuardsTraningDao;

@Service("GuardsTraningService")
public class GuardsTraningServiceImpl implements GuardsTraningService{
	
	@Autowired
	GuardsTraningDao guardsTraningDao;

	@Override
	public GuardsTraning add(GuardsTraning guardsTraning) throws RecordNotFoundException{
		guardsTraningDao.saveAndFlush(guardsTraning);
		return guardsTraning;
	}

	@Override
	public GuardsTraning update(GuardsTraning guardsTraning) throws RecordNotFoundException{
		GuardsTraning bean = null;
		try {
			bean = guardsTraningDao.findById(guardsTraning.getGuardsTraningId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guards Traning details not found!");
		}
		guardsTraningDao.saveAndFlush(guardsTraning);
		return bean;
	}

	@Override
	public GuardsTraning delete(GuardsTraning guardsTraning) throws RecordNotFoundException{
		GuardsTraning bean = null;
		try {
			bean = guardsTraningDao.findById(guardsTraning.getGuardsTraningId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guards Traning details not found!");
		}
		guardsTraningDao.deleteById(guardsTraning.getGuardsTraningId());
		return bean;
	}

	@Override
	public List<GuardsTraning> findByName(String name) throws RecordNotFoundException{
		List<GuardsTraning> guardsTranings = new ArrayList<>();
		try {
			for(GuardsTraning i :guardsTraningDao.findAll()) {
				if(i.getName().equals(name)) {
					guardsTranings.add(i);
				}
			}
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guards Traning details not found!");
		}
		return guardsTranings;
	}

	@Override
	public GuardsTraning findById(int guardsTraningId) throws RecordNotFoundException{
		GuardsTraning bean = null;
		try {
			bean = guardsTraningDao.findById(guardsTraningId).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guards Traning details not found!");
		}
		return bean;
	}

	@Override
	public GuardsTraning search(GuardsTraning guardsTraning) throws RecordNotFoundException{
		GuardsTraning bean = null;
		try {
			bean = guardsTraningDao.findById(guardsTraning.getGuardsTraningId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Guards Traning details not found!");
		}
		return bean;
	}

}
