package com.yrton.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.yrton.dao.SysInfoDao;
import com.yrton.entity.SysInfo;
import com.yrton.service.ints.InfoService;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

/**
 * @Author: whmyit@163.com
 * @Description:
 * @Date: Created in 16:48  2018/3/29
 */
@Service(version = "1.0.0")
public class InfoServiceImpl implements InfoService{


    @Autowired
    private SysInfoDao sysInfoDao;

    @Override
    public List<SysInfo> getAll() {
        return sysInfoDao.getAll();
    }

    @Override
    public String SayHello(String string) {
        return "Hello word !"+string;
    }


}
