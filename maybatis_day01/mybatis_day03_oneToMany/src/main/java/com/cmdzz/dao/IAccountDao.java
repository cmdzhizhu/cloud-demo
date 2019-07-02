package com.cmdzz.dao;

import com.cmdzz.domain.Account;

import java.util.List;

/**
 * @author cmdzz
 * @date 2019/7/1 - 16:17
 */
public interface IAccountDao {

    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAll();
}
