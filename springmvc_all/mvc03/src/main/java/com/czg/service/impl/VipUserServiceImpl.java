package com.czg.service.impl;

import com.czg.mapper.VipUserMapper;
import com.czg.pojo.VipUser;
import com.czg.service.VipUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/5 - 05 - 05 - 20:56
 * @Description: com.czg.service.impl
 * @version: 1.0
 */
@Service
public class VipUserServiceImpl implements VipUserService {
    @Autowired
    private VipUserMapper vipUserMapper;
    @Override
    public VipUser findUser(String name, String password) {
        return vipUserMapper.findUser(name, password);


    }
}
