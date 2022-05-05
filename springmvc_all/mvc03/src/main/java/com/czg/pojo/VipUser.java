package com.czg.pojo;

import java.io.Serializable;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/5 - 05 - 05 - 20:54
 * @Description: com.czg.pojo
 * @version: 1.0
 */
public class VipUser implements Serializable {
    
    private Integer vid;
    private String uname;
    private String pwd;

    @Override
    public String toString() {
        return "VipUser{" +
                "vid=" + vid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public VipUser(Integer vid, String uname, String pwd) {
        this.vid = vid;
        this.uname = uname;
        this.pwd = pwd;
    }

    public VipUser() {
    }
}
