package cn.cmdzz.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author cmdzz
 * @date 2019/5/28 - 21:29
 */
    @Table(name = "tb_user")
    @Data
    public class User implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // 用户名
        private String username;

        // 密码
        private String password;


        private String phone;

        private Date created;



}
