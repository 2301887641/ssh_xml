package com.time.service.impl;

import com.time.dao.api.InfoDao;
import com.time.service.api.InfoService;
import com.time.service.api.UserService;
import com.time.service.dto.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author suiguozhen on 19-1-2 下午7:30
 */
@Service
public class InfoServiceImpl extends BaseServiceImpl implements InfoService {

    @Autowired
    private InfoDao infoDao;


    public void save() {
        Info info = new Info();
        info.setUsername("娃娃");
        infoDao.save(info);
    }

    @Transactional(rollbackFor=Exception.class)
    public void save2() {
        Info info = new Info();
        info.setUsername("娃娃");
        infoDao.save(info);
//        int i = 1 / 0;
        Info info2 = new Info();
        info2.setUsername("娃娃2");
        infoDao.save(info2);
    }
}
