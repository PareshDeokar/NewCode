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
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.service.FlatService;
import com.cg.asm.service.GuardSalaryService;
import com.cg.asm.service.GuardShiftService;

@RestController
@RequestMapping("/asm-guardshift")
public class GuardShiftController {
	
	@Autowired
	GuardShiftService guardShiftService;
	
	@PostMapping("/addguardshift")
	public GuardShift add(@RequestBody  GuardShift guardShift) throws RecordNotFoundException{
		return guardShiftService.add(guardShift);
	}
	
	@PutMapping("/updateguardshift")
	public GuardShift update(@RequestBody  GuardShift guardShift) throws RecordNotFoundException{
		return guardShiftService.update(guardShift);
	}
	
	@DeleteMapping("/deleteguardshift")
	public GuardShift delete(@RequestBody  GuardShift guardShift) throws RecordNotFoundException{
		return guardShiftService.delete(guardShift);
	}
	
	@GetMapping("/getguardshiftbyname/{name}")
	public List<GuardShift> findByName(@PathVariable String name) throws RecordNotFoundException{
		return guardShiftService.findByName(name);
	}
	
	@GetMapping("/getguardshiftbyid/{guardShiftId}")
	public GuardShift findById(@PathVariable int guardShiftId) throws RecordNotFoundException{
		return guardShiftService.findById(guardShiftId);
	}
	
	@GetMapping("/getguardshift")
	public GuardShift search(@RequestBody GuardShift guardShift) throws RecordNotFoundException{
		return guardShiftService.search(guardShift);
	}

}
