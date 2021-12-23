package com.cg.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.asm.entity.Flat;
import com.cg.asm.entity.GuardShift;

@Repository
public interface GuardShiftDao extends JpaRepository<GuardShift, Integer>{

}
