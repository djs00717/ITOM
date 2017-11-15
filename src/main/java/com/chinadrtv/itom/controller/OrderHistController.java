package com.chinadrtv.itom.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by djs on 2017/10/13.
 */

@Controller
@RequestMapping("/")
public class OrderHistController {
    static Logger logger= LogManager.getLogger(OrderHistController.class);
    @RequestMapping(value = "/getOrder" ,method = RequestMethod.GET)
    public ModelAndView getOrder(ModelMap modelMap){
        ModelAndView mv = new ModelAndView("testControllerJsp");
        mv.addObject("message","Hello Word!中文字体很漂亮");
        logger.info("mv add message");
        mv.addObject("list","此地无银三百两!");
        logger.info("mv add list");

        logger.warn("return mv");
        return mv;
    }


    @RequestMapping(value = "/jndi" ,method = RequestMethod.GET)
    public ModelAndView getJndi(ModelMap modelMap){
        ModelAndView mv = new ModelAndView("jndi/jndiTest");
        mv.addObject("message","Hello Word!中文字体很漂亮");
        logger.info("mv add message");
        mv.addObject("list","此地无银三百两!");
        logger.info("mv add list");

        logger.warn("return mv");
        return mv;
    }

}
