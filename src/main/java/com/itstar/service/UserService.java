package com.itstar.service;

import com.itstar.pojo.User;

import java.util.List;

public interface UserService {

   List<User> findByAll();

   User findById(Integer id);

   void updateBy(User user);
}
