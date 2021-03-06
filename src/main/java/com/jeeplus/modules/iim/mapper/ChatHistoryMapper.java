/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">Qtrj</a> All rights reserved.
 */
package com.jeeplus.modules.iim.mapper;

import com.jeeplus.core.persistence.BaseMapper;
import com.jeeplus.core.persistence.annotation.MyBatisMapper;
import com.jeeplus.modules.iim.entity.ChatHistory;

import java.util.List;

/**
 * 聊天记录MAPPER接口
 *
 * @author jeeplus
 * @version 2015-12-29
 */
@MyBatisMapper
public interface ChatHistoryMapper extends BaseMapper<ChatHistory> {


    /**
     * 查询列表数据
     *
     * @param entity
     * @return
     */
    List<ChatHistory> findLogList(ChatHistory entity);


    /**
     * 查询群组列表数据
     *
     * @param entity
     * @return
     */
    List<ChatHistory> findGroupLogList(ChatHistory entity);

    int findUnReadCount(ChatHistory chatHistory);

}