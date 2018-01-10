package com.kingfisher.service;/**
 * Created by xinglongfan on 2018/1/10.
 */

import com.kingfisher.dao.UserDao;
import com.kingfisher.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author
 * @create 2018-01-10 下午3:27
 **/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(int id){
        return userDao.getUserById(id);
    }

    @Transactional
    public boolean insertUser(){

        User user1 = new User();
        user1.setId(11);
        user1.setName("aaaa");

        userDao.insertUser(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("xxx");

        userDao.insertUser(user2);
        return true;
    }


}
