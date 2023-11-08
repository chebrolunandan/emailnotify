package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.EmailManager;

@RestController
@RequestMapping("/mail")
public class EmailController {

	@Autowired
	EmailManager M;
	
	@GetMapping("send")
	public String send()
	{
		return M.sendEmail("chebrolunandan1112@gmail.com", "chebrolunandu123@gmail.com", "Testing Mail", "Test");
	}
}
