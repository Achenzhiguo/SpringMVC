package com.czg.service.impl;

import com.czg.mapper.Imapper;
import com.czg.pojo.Iuser;
import com.czg.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/8 - 05 - 08 - 18:46
 * @Description: com.czg.service.impl
 * @version: 1.0
 */
@Service
public class IserviceImpl implements Iservice {
    @Autowired
    private Imapper imapper;
    @Override
    public int addIuser(Iuser iuser) {
        return imapper.addIuser(iuser);
    }
}
