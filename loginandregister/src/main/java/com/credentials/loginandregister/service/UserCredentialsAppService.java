package com.credentials.loginandregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credentials.loginandregister.model.IUserCredentialsRepository;
import com.credentials.loginandregister.model.UserCredentials;

@Service
public class UserCredentialsAppService {

	private IUserCredentialsRepository iUserCredentialsRepository;

	@Autowired
	public UserCredentialsAppService(IUserCredentialsRepository iUserCredentialsRepository) {
		this.iUserCredentialsRepository = iUserCredentialsRepository;
	}

	public UserCredentials save(UserCredentials userCredentials) {
		iUserCredentialsRepository.save(userCredentials);
		return userCredentials;
	}

}
