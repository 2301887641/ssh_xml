package com.time.dao.api;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author suiguozhen on 19-1-1 下午6:39
 */
public interface BaseDao<DTO> {
     void save(DTO dto);
}
