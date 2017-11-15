package com.chinadrtv.itom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by djs on 2017/11/11.
 */
@Entity
@Table(
        name = "userinfo",
        schema = "aco_scm"
)
public class UserInfo {
    String loginName;
    String passWord;

    public UserInfo(){
    }

    @Id
    @Column(
            name="LOGINNAME"
    )
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Column(
            name="PASSWORD"
    )
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
