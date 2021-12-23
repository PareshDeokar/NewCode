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
import com.cg.asm.entity.User;
import com.cg.asm.exception.RecordNotFoundException;
import com.cg.asm.service.FlatService;
import com.cg.asm.service.GuardSalaryService;
import com.cg.asm.service.GuardShiftService;
import com.cg.asm.service.GuardsTraningService;
import com.cg.asm.service.SecurityService;
import com.cg.asm.service.UserService;


@RestController
@RequestMapping("/asm-user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	public User add(@RequestBody User user) throws RecordNotFoundException{
		return userService.add(user);
	}
	
	@PutMapping("/updateuser")
	public User update(@RequestBody User user)throws RecordNotFoundException{
		return userService.update(user);
	}
	
	@DeleteMapping("/deleteuser")
	public User delete(@RequestBody User user)throws RecordNotFoundException{
		return userService.delete(user);
	}
	
	@GetMapping("/getuserbyloginid/{loginId}")
	public List<User> findByLoginId(@PathVariable String loginId)throws RecordNotFoundException{
		return userService.findByLoginId(loginId);
	}
	
	@GetMapping("/getuserbyid/{userId}")
	public User findById(@PathVariable int userId)throws RecordNotFoundException{
		return userService.findById(userId);
	}
	
	@GetMapping("/getuser")
	public User search(@RequestBody User user)throws RecordNotFoundException{
		return userService.search(user);
	}
	
	@GetMapping("/authenticate")
	public String authenticate(@RequestBody User user)throws RecordNotFoundException{
		return userService.authenticate(user);
	}
	
	@PutMapping("/updatepassword/{userId}/{oldPassword}/{newPassword}")
	public boolean changePassword(@PathVariable int userId,@PathVariable  String oldPassword,@PathVariable  String newPassword)throws RecordNotFoundException {
		return userService.changePassword(userId, oldPassword, newPassword);
	}

	@PostMapping("/registeruser")
    public User registerUser(@RequestBody User user)throws RecordNotFoundException{
    	return userService.registerUser(user);
    }
    
	@GetMapping("/forgotpassword/{loginId}")
    public List<User>  forgetPassword(@PathVariable String loginId)throws RecordNotFoundException{
    	return userService.forgetPassword(loginId);
    }
   

}
