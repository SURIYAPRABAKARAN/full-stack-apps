package com.credentials.loginandregister.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credentials.loginandregister.model.UserCredentials;
import com.credentials.loginandregister.service.UserCredentialsAppService;

@RestController
@RequestMapping("/user-credentials")
public class UserCredentialsCtrl {

	private UserCredentialsAppService userCredentialsAppService;

	@Autowired
	public UserCredentialsCtrl(UserCredentialsAppService userCredentialsAppService) {
		this.userCredentialsAppService = userCredentialsAppService;
	}

	@PostMapping("/save")
	public String save(@RequestBody UserCredentials userCredentials) {
		userCredentialsAppService.save(userCredentials);
		return "Saved";
	}

}
