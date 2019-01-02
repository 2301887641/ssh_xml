package com.time.dao.impl;

import com.time.dao.api.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author suiguozhen on 19-1-1 下午6:48
 */
public class BaseDaoImpl<DTO> implements BaseDao<DTO> {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public void save(DTO dto) {
        Session session = sessionFactory.openSession();
        session.save(dto);
    }
}