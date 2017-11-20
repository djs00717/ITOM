package com.chinadrtv.itom.dao.impl;

import com.chinadrtv.itom.dao.UserInfoDao;
import com.chinadrtv.itom.model.UserInfo;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by djs on 2017/11/15.
 */
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

    public List<UserInfo> list() {
//        Session session=getSession();
//        Query query=session.createQuery("from UserInfo");
//        return query.list();
        return null;
    }
}
