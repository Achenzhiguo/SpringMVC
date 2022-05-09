package com.czg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/8 - 05 - 08 - 18:38
 * @Description: com.czg.pojo
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Iuser implements Serializable {
    private Integer id;
    private String iname;
    private String ipwd;
    private String nickname;
    private String photo;
    private String filetype;
}

