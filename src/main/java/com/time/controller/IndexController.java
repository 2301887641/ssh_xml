package com.time.controller;

import com.time.service.api.InfoService;
import com.time.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author suiguozhen on 18-12-31 下午8:45
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @Autowired
    private InfoService infoService;

    @RequestMapping("index.action")
    public ModelAndView index(ModelAndView model){
        infoService.save2();
        model.setViewName("index");
        return model;
    }
}