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
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.service.FlatService;
import com.cg.asm.service.GuardSalaryService;

@RestController
@RequestMapping("/asm-guardsalary")
public class GuardSalaryController {
	
	@Autowired
	GuardSalaryService guardSalaryService;
	
	@PostMapping("/addguardsalary")
	public GuardSalary add(@RequestBody GuardSalary guardSalary)  throws RecordNotFoundException{
		return guardSalaryService.add(guardSalary);
	}
	
	@PutMapping("/updateguardsalary")
	public GuardSalary update(@RequestBody GuardSalary guardSalary)  throws RecordNotFoundException{
		return guardSalaryService.update(guardSalary);
	}
	
	@DeleteMapping("/deleteguardsalary")
	public GuardSalary delete(@RequestBody GuardSalary guardSalary) throws RecordNotFoundException{
		return guardSalaryService.delete(guardSalary);
	}
	
	@GetMapping("/getguardsalarybyname/{name}")
	public List<GuardSalary> findByName(@PathVariable String name) throws RecordNotFoundException{
		return guardSalaryService.findByName(name);
	}
	
	@GetMapping("/getguardsalarybyid/{guardSalaryId}")
	public GuardSalary findById(@PathVariable int guardSalaryId) throws RecordNotFoundException{
		return guardSalaryService.findById(guardSalaryId);
	}

	@GetMapping("/getguardsalary")
	public GuardSalary search(@RequestBody GuardSalary guardSalary) throws RecordNotFoundException{
		return guardSalaryService.search(guardSalary);
	}
	

}
