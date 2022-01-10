package com.example.scheduler.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scheduler.model.User;

@Repository
public interface UserDao extends JpaRepository<User,Integer>{

}
