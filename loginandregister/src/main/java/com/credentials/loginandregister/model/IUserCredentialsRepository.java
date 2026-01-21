package com.credentials.loginandregister.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserCredentialsRepository extends JpaRepository<UserCredentials, Long> {

}
