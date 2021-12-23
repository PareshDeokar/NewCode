package com.cg.asm.service;

import java.util.List;

import com.cg.asm.entity.User;
import com.cg.asm.exception.RecordNotFoundException;

public interface UserService {
	
	public User add(User user) throws RecordNotFoundException;
	
	public User update(User user)throws RecordNotFoundException;
	
	public User delete(User user)throws RecordNotFoundException;
	
	public List<User> findByLoginId(String loginId)throws RecordNotFoundException;
	
	public User findById(int userId)throws RecordNotFoundException;
	
	public User search(User user)throws RecordNotFoundException;
	
	public String authenticate(User user)throws RecordNotFoundException;
	
	public boolean changePassword(int userId, String oldPassword, String newPassword)throws RecordNotFoundException ;

    public User registerUser(User user)throws RecordNotFoundException;
    
    public List<User>  forgetPassword(String loginId)throws RecordNotFoundException;

}
