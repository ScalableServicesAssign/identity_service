package com.bitswilp.langlearn.identityService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitswilp.langlearn.identityService.entity.UserCredential;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}
