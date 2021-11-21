package com.learning.jpa.jpainsteps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.jpa.jpainsteps.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
