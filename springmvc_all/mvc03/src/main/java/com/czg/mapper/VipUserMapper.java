package com.czg.mapper;

import com.czg.pojo.VipUser;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Auther: erdongchen
 * @Date: 2022/5/5 - 05 - 05 - 20:57
 * @Description: com.czg.mapper
 * @version: 1.0
 */

public interface VipUserMapper {

    VipUser findUser(String name, String password);
}
