package com.cg.asm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.asm.entity.GuardsTraning;
import com.cg.asm.entity.Security;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.repository.SecurityDao;

@Service("SecurityService")
public class SecurityServiceImpl implements SecurityService {
	
	@Autowired
	SecurityDao securityDao;

	@Override
	public Security add(Security security) throws RecordNotFoundException {
		securityDao.saveAndFlush(security);
		return security;
	}

	@Override
	public Security update(Security security) throws RecordNotFoundException {
		Security bean = null;
		try {
			bean = securityDao.findById(security.getSecurityId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Security details not found!");
		}
		securityDao.saveAndFlush(security);
		return bean;
	}

	@Override
	public Security delete(Security security) throws RecordNotFoundException {
		Security bean = null;
		try {
			bean = securityDao.findById(security.getSecurityId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Security details not found!");
		}
		securityDao.deleteById(security.getSecurityId());
		return bean;
	}

	@Override
	public Security findById(int securityId) throws RecordNotFoundException {
		Security bean = null;
		try {
			bean = securityDao.findById(securityId).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Security details not found!");
		}
		return bean;
	}

	@Override
	public Security search(Security security) throws RecordNotFoundException {
		Security bean = null;
		try {
			bean = securityDao.findById(security.getSecurityId()).get();
		}
		catch(Exception e) {
			throw new RecordNotFoundException("Security details not found!");
		}
		return bean;
	}

}
