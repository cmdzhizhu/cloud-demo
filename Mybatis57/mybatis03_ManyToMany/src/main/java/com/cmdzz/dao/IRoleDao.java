package com.cmdzz.dao;

import com.cmdzz.domain.Role;

import java.util.List;

/**
 * @author cmdzz
 * @date 2019/7/2 - 16:02
 */
public interface IRoleDao {

    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
