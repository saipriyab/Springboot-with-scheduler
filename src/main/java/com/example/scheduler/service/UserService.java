package com.example.scheduler.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.scheduler.dao.UserDao;
import com.example.scheduler.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	//schedule a job to add object to db
	@Scheduled(fixedDelay=5000)
	public void addToDatabase()
	{
		User user=new User();
		user.setName("user "+new Random().nextInt(34123));
		userDao.save(user);
		System.out.println("adding object"+new Date().toString());
	}
	
	@Scheduled(cron="0/15 * * * * *")
	public void fetchDBData()
	{
		List<User> users=userDao.findAll();
		System.out.println("making service call"+new Date().toString());
		System.out.println("no of records fetched"+users.size());
		
	}
}
