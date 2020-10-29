/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.jeeplus.core.persistence;

import java.util.List;

/**
 * DAO支持类实现
 *
 * @param <T>
 * @author jeeplus
 * @version 2017-05-16
 */
public interface TreeMapper<T extends TreeEntity<T>> extends BaseMapper<T> {

    /**
     * 找到所有子节点
     *
     * @param entity
     * @return
     */
    List<T> findByParentIdsLike(T entity);

    /**
     * 更新所有父节点字段
     *
     * @param entity
     * @return
     */
    int updateParentIds(T entity);


    int updateSort(T entity);

    List<T> getChildren(String parentId);


}