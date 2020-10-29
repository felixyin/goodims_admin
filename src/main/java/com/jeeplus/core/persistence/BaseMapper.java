/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.jeeplus.core.persistence;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * DAO支持类实现
 *
 * @param <T>
 * @author jeeplus
 * @version 2017-05-16
 */
public interface BaseMapper<T> {

    /**
     * 获取单条数据
     *
     * @param id
     * @return
     */
    T get(String id);

    /**
     * 获取单条数据
     *
     * @param entity
     * @return
     */
    T get(T entity);

    /**
     * 根据实体名称和字段名称和字段值获取唯一记录
     *
     * @param propertyName
     * @param value
     * @return
     */
    T findUniqueByProperty(@Param(value = "propertyName") String propertyName, @Param(value = "value") Object value);


    /**
     * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
     *
     * @param entity
     * @return
     */
    List<T> findList(T entity);

    /**
     * 查询所有数据列表
     *
     * @param entity
     * @return
     */
    List<T> findAllList(T entity);

    /**
     * 查询所有数据列表
     *
     * @return
     * @see public List<T> findAllList(T entity)
     */
    @Deprecated
    List<T> findAllList();

    /**
     * 插入数据
     *
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 更新数据
     *
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除数据（物理删除，从数据库中彻底删除）
     *
     * @param id
     * @return
     * @see public int delete(T entity)
     */
    @Deprecated
    int delete(String id);

    /**
     * 删除数据（逻辑删除，更新del_flag字段为1,在表包含字段del_flag时，可以调用此方法，将数据隐藏）
     *
     * @param id
     * @return
     * @see public int delete(T entity)
     */
    @Deprecated
    int deleteByLogic(String id);

    /**
     * 删除数据（物理删除，从数据库中彻底删除）
     *
     * @param entity
     * @return
     */
    int delete(T entity);

    /**
     * 删除数据（逻辑删除，更新del_flag字段为1,在表包含字段del_flag时，可以调用此方法，将数据隐藏）
     *
     * @param entity
     * @return
     */
    int deleteByLogic(T entity);

    @Select("${sql}")
    List<Map<String, Object>> execSelectSql(@Param(value = "sql") String sql);

    @Update("${sql}")
    void execUpdateSql(@Param(value = "sql") String sql);

    @Insert("${sql}")
    void execInsertSql(@Param(value = "sql") String sql);

    @Delete("${sql}")
    void execDeleteSql(@Param(value = "sql") String sql);

}