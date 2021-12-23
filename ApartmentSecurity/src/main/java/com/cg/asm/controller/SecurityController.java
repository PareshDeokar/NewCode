package com.cg.asm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.asm.entity.Flat;
import com.cg.asm.entity.GuardSalary;
import com.cg.asm.entity.GuardShift;
import com.cg.asm.entity.GuardsTraning;
import com.cg.asm.entity.Security;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.service.FlatService;
import com.cg.asm.service.GuardSalaryService;
import com.cg.asm.service.GuardShiftService;
import com.cg.asm.service.GuardsTraningService;
import com.cg.asm.service.SecurityService;

@RestController
@RequestMapping("/asm-security")
public class SecurityController {
	
	@Autowired
	SecurityService securityService;
	
	@PostMapping("/addsecurity")
	public Security add(@RequestBody Security security) throws RecordNotFoundException{
		return securityService.add(security);
	}
	
	@PutMapping("/updatesecurity")
	public Security update(@RequestBody Security security) throws RecordNotFoundException{
		return securityService.update(security);
	}
	
	@DeleteMapping("/deletesecurity")
	public Security delete(@RequestBody Security security)throws RecordNotFoundException{
		return securityService.delete(security);
	}
	
	@GetMapping("/getsecuritybyid/{securityId}")
	public Security findById(@PathVariable int securityId)throws RecordNotFoundException{
		return securityService.findById(securityId);
	}
	
	@GetMapping("/getsecurity")
	public Security search(@RequestBody Security security)throws RecordNotFoundException{
		return securityService.search(security);
	}

}
