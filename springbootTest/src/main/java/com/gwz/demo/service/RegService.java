package com.gwz.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegService implements  IRegService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean regUser(String uerId, String pwd) {

        Boolean flag;
        try {
            flag = userMapper.insertUsers(uerId,pwd);
        }catch (Exception e){
            return false;
        }
        return flag;
    }

}
