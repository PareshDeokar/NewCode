package com.cg.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.asm.entity.GuardSalary;

@Repository
public interface GuardSalaryDao extends JpaRepository<GuardSalary, Integer>{

}
