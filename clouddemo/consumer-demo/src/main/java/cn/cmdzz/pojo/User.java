package cn.cmdzz.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cmdzz
 * @date 2019/5/28 - 21:29
 */

    public class User implements Serializable {

        private static final long serialVersionUID = 1L;

        private Long id;

        // 用户名
        private String username;

        // 密码
        private String password;


        private String phone;

        private Date created;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
