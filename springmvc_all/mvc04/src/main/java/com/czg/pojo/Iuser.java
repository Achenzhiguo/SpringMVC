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

    @Override
    public String toString() {
        return "Iuser{" +
                "id=" + id +
                ", iname='" + iname + '\'' +
                ", ipwd='" + ipwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", photo='" + photo + '\'' +
                ", filetype='" + filetype + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIpwd() {
        return ipwd;
    }

    public void setIpwd(String ipwd) {
        this.ipwd = ipwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
}

