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
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.service.FlatService;

@RestController
@RequestMapping("/asm-flat")
public class FlatController {
	
	@Autowired
	FlatService faltService;
	
	@PostMapping("/addflat")
	public Flat add(@RequestBody Flat flat) throws RecordNotFoundException{
		return faltService.add(flat);
	}
	
	@PutMapping("/updateflat")
	public Flat update(@RequestBody Flat flat) throws RecordNotFoundException{
		return faltService.update(flat);
	}
	
	@DeleteMapping("/deleteflat")
	public Flat delete(@RequestBody Flat flat) throws RecordNotFoundException{
		return faltService.delete(flat);
	}
	
	@GetMapping("/getflatbyownername/{name}")
	public List<Flat> findByOwnerName(@PathVariable String name) throws RecordNotFoundException{
		return faltService.findByOwnerName(name);
	}
	
	@GetMapping("/getflatbyid/{flatId}")
	public Flat findById(@PathVariable int flatId) throws RecordNotFoundException{
		return faltService.findById(flatId);
	}
	
	@GetMapping("/getflat")
	public Flat search(@RequestBody Flat flat) throws RecordNotFoundException{
		return faltService.search(flat);
	}

}


// UI (Operation) -> controller -> service layer methods -> Dao (JPA) METHODS - >  Entity 
