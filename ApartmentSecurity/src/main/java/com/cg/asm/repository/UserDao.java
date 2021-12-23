package com.cg.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.asm.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
