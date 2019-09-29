package com.itstar.service;

import com.itstar.mapper.UserMapper;
import com.itstar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserserviceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findByAll() {

        List<User> users = userMapper.selectByExample(null);

        return users;
    }

    @Override
    public User findById(Integer id) {

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateBy(User user) {
        userMapper.updateByPrimaryKey(user);
    }
}
