package com.cg.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.asm.entity.Security;

@Repository
public interface SecurityDao  extends JpaRepository<Security, Integer>{

}
