package com.slb.group1.local.table;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.slb.group1.local.table.NewsTypeInfo;

import com.slb.group1.local.table.NewsTypeInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsTypeInfoDaoConfig;

    private final NewsTypeInfoDao newsTypeInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsTypeInfoDaoConfig = daoConfigMap.get(NewsTypeInfoDao.class).clone();
        newsTypeInfoDaoConfig.initIdentityScope(type);

        newsTypeInfoDao = new NewsTypeInfoDao(newsTypeInfoDaoConfig, this);

        registerDao(NewsTypeInfo.class, newsTypeInfoDao);
    }
    
    public void clear() {
        newsTypeInfoDaoConfig.clearIdentityScope();
    }

    public NewsTypeInfoDao getNewsTypeInfoDao() {
        return newsTypeInfoDao;
    }

}
