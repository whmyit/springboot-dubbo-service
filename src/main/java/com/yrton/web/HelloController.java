package com.yrton.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @Author: whmyit@163.com
 * @Description:
 * @Date: Created in 14:15  2018/3/13
 *
 */
@Controller // 默认返回json格式，如果需要页面开发使用@Controller
public class HelloController   {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    private InfoService infoService;

    @GetMapping({"/hello"})
    @ResponseBody
    public String hello(){
//        boolean ok=true;
        logger.info("----------  hello spring boot");
        return "hello spring boot";
    }


    @GetMapping({"/index","/"})
    public String index(){
        logger.info("---------- index222");
        return "index";
    }

    @GetMapping({"/info"})
    @ResponseBody
    public Object sysinfo(){

//        return infoService.getAll();
        return "---------- hello ----------";
    }


    @GetMapping({"/zkget"})
    @ResponseBody
    public Object zkget(){

//        Watcher watcher =


        return null;
    }

}
