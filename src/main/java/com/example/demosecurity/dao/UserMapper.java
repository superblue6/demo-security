package com.example.demosecurity.dao;

import com.example.demosecurity.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    User getUserByName(String userName);
}
