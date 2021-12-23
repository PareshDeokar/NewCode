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
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.service.FlatService;
import com.cg.asm.service.GuardSalaryService;
import com.cg.asm.service.GuardShiftService;
import com.cg.asm.service.GuardsTraningService;

@RestController
@RequestMapping("/asm-guardstraining")
public class GuardsTraningController {
	
	@Autowired
	GuardsTraningService guardsTraningService;
	

	@PostMapping("/addguardstraining")
	public GuardsTraning add(@RequestBody GuardsTraning guardsTraning) throws RecordNotFoundException{
		return guardsTraningService.add(guardsTraning);
	}
	
	@PutMapping("/updateguardstraining")
	public GuardsTraning update(@RequestBody GuardsTraning guardsTraning)throws RecordNotFoundException{
		return guardsTraningService.update(guardsTraning);
	}
	
	@DeleteMapping("/deleteguardstraining")
	public GuardsTraning delete(@RequestBody GuardsTraning guardsTraning)throws RecordNotFoundException{
		return guardsTraningService.delete(guardsTraning);
	}
	
	@GetMapping("/getguardstrainingbyname/{name}")
	public List<GuardsTraning> findByName(@PathVariable String name)throws RecordNotFoundException{
		return guardsTraningService.findByName(name);
	}
	
	@GetMapping("/getguardstrainingbyid/{guardsTraningId}")
	public GuardsTraning findById(@PathVariable int guardsTraningId)throws RecordNotFoundException{
		return guardsTraningService.findById(guardsTraningId);
	}
	
	@GetMapping("/getguardstraining")
	public GuardsTraning search(@RequestBody GuardsTraning guardsTraning)throws RecordNotFoundException{
		return guardsTraningService.search(guardsTraning);
	}

}
