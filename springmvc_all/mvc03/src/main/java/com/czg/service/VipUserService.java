package com.czg.service;

import com.czg.pojo.VipUser;
import org.springframework.stereotype.Service;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/5 - 05 - 05 - 20:56
 * @Description: com.czg.service
 * @version: 1.0
 */

public interface VipUserService {
    VipUser findUser(String name, String password);
}



