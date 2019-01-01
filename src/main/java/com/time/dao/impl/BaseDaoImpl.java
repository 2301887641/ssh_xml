package com.time.dao.impl;

import com.time.dao.api.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author suiguozhen on 19-1-1 下午6:48
 */
public class BaseDaoImpl implements BaseDao {

    public SessionFactory getS() {
        return null;
    }
}