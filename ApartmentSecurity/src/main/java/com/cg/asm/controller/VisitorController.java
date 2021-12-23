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
import com.cg.asm.entity.Visitor;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.service.FlatService;
import com.cg.asm.service.GuardSalaryService;
import com.cg.asm.service.GuardShiftService;
import com.cg.asm.service.GuardsTraningService;
import com.cg.asm.service.SecurityService;
import com.cg.asm.service.VisitorService;

@RestController
@RequestMapping("/asm-visitor")
public class VisitorController {
	
	@Autowired
	VisitorService visitorService;
	
	@PostMapping("/addvisitor")
	public Visitor add(@RequestBody Visitor visitor)throws RecordNotFoundException{
		return visitorService.add(visitor);
	}
	
	@PutMapping("/updatevisitor")
	public Visitor update(@RequestBody Visitor visitor)throws RecordNotFoundException{
		return visitorService.update(visitor);
	}
	
	@DeleteMapping("/deletevisitor")
	public Visitor delete(@RequestBody Visitor visitor)throws RecordNotFoundException{
		return visitorService.delete(visitor);
	}
	
	@GetMapping("/getvisitorbyname/{name}")
	public List<Visitor> findByName(@PathVariable String name)throws RecordNotFoundException{
		return visitorService.findByName(name);
	}
	
	@GetMapping("/getvisitorbyid/{visitorId}")
	public Visitor findById(@PathVariable int visitorId)throws RecordNotFoundException{
		return visitorService.findById(visitorId);
	}
	
	@GetMapping("/getvisitor")
	public Visitor search(@RequestBody Visitor visitor)throws RecordNotFoundException{
		return visitorService.search(visitor);
	}
	

}
