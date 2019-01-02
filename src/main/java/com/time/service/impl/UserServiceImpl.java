package com.time.service.impl;

import com.sun.xml.internal.rngom.parse.host.Base;
import com.time.dao.api.UserDao;
import com.time.service.api.UserService;
import com.time.service.dto.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author suiguozhen on 19-1-1 下午12:55
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public void save() {
        User user = new User();
        user.setUsername("哈哈");
        user.setAge(12);
        userDao.save(user);
        System.out.println("save");
    }
}