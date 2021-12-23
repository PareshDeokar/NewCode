package com.cg.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.asm.entity.GuardsTraning;

@Repository
public interface GuardsTraningDao extends JpaRepository<GuardsTraning, Integer>{

}
