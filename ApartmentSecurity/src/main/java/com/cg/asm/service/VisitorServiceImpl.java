package com.cg.asm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.asm.entity.User;
import com.cg.asm.entity.Visitor;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.repository.VisitorDao;

@Service("VisitorService")
public class VisitorServiceImpl implements VisitorService {
	
	@Autowired
	VisitorDao visitorDao;

	@Override
	public Visitor add(Visitor visitor) throws RecordNotFoundException {
		visitorDao.saveAndFlush(visitor);
		return visitor;
	}

	@Override
	public Visitor update(Visitor visitor) throws RecordNotFoundException {
		Visitor bean = null;
		try {
			bean = visitorDao.findById(visitor.getVisitorId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Visitor details not found!");
		}
		visitorDao.saveAndFlush(visitor);
		return bean;
	}

	@Override
	public Visitor delete(Visitor visitor) throws RecordNotFoundException {
		Visitor bean = null;
		try {
			bean = visitorDao.findById(visitor.getVisitorId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Visitor details not found!");
		}
		visitorDao.deleteById(visitor.getVisitorId());
		return bean;
	}

	@Override
	public List<Visitor> findByName(String name) throws RecordNotFoundException {
		List<Visitor> visitors = new ArrayList<>();
		try {
			for(Visitor i :visitorDao.findAll()) {
				if(i.getName().equals(name)) {
					visitors.add(i);
				}
			}
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Visitor details not found!");
		}
		return visitors;
	}

	@Override
	public Visitor findById(int visitorId) throws RecordNotFoundException {
		Visitor bean = null;
		try {
			bean = visitorDao.findById(visitorId).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Visitor details not found!");
		}
		return bean;
	}

	@Override
	public Visitor search(Visitor visitor) throws RecordNotFoundException {
		Visitor bean = null;
		try {
			bean = visitorDao.findById(visitor.getVisitorId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Visitor details not found!");
		}
		return bean;
	}

}
