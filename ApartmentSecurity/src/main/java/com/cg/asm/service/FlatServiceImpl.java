package com.cg.asm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.asm.entity.Flat;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.repository.FlatDao;

@Service("FlatService")
public class FlatServiceImpl implements FlatService{
	
	
	@Autowired
	FlatDao flatDao;

	@Override
	public Flat add(Flat flat) throws RecordNotFoundException {
		flatDao.saveAndFlush(flat);
		return flat;
	}

	@Override
	public Flat update(Flat flat) throws RecordNotFoundException {
		Flat bean = null;
		try {
			bean = flatDao.findById(flat.getFlatId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Flat details not found!");
		}
		flatDao.saveAndFlush(flat);
		return bean;
	}

	@Override
	public Flat delete(Flat flat) throws RecordNotFoundException {
		Flat bean = null;
		try {
			bean = flatDao.findById(flat.getFlatId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Flat details not found!");
		}
		flatDao.deleteById(flat.getFlatId());
		return bean;
	}

	@Override
	public List<Flat> findByOwnerName(String name) throws RecordNotFoundException {
		List<Flat> flats = new ArrayList<>();
		try {
			for(Flat i :flatDao.findAll()) {
				if(i.getOwnerName().equals(name)) {
					flats.add(i);
				}
			}
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Flat details not found!");
		}
		return flats;
	}

	@Override
	public Flat findById(int flatId) throws RecordNotFoundException {
		Flat bean = null;
		try {
			bean = flatDao.findById(flatId).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Flat details not found!");
		}
		return bean;
	}

	@Override
	public Flat search(Flat flat) throws RecordNotFoundException {
		Flat bean = null;
		try {
			bean = flatDao.findById(flat.getFlatId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Flat details not found!");
		}
		return bean;
	}

}


/*
 
 MVC - Model View Controller
 
 */










