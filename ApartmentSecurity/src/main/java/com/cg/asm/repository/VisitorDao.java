package com.cg.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.asm.entity.Visitor;

@Repository
public interface VisitorDao extends JpaRepository<Visitor, Integer>{

}
