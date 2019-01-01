package com.time.service.impl;

import com.time.dao.api.UserDao;
import com.time.service.api.UserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author suiguozhen on 19-1-1 下午12:55
 */
@Service("userService")
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private SessionFactory sessionFactory;

    public void save() {
//        SessionFactory sessionFactory = userDao.getS();
        System.out.println("save");
    }
}
