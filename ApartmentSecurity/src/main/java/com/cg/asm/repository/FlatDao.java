package com.cg.asm.repository;

import org.springframework.stereotype.Repository;

import com.cg.asm.entity.Flat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlatDao extends JpaRepository<Flat, Integer>{
	
}
