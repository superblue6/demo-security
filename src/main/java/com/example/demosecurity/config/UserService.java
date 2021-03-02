package com.example.demosecurity.config;

import com.example.demosecurity.bean.User;
import com.example.demosecurity.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userMapper.getUserByName(userName);
        if (user == null){
            throw new UsernameNotFoundException("账户不存在");
        }
        return user;
    }
}
