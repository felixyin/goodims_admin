/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">Qtrj</a> All rights reserved.
 */
package com.jeeplus.modules.test.tree.dialog.service;

import com.jeeplus.common.utils.StringUtils;
import com.jeeplus.core.service.TreeService;
import com.jeeplus.modules.test.tree.dialog.entity.TestTree1;
import com.jeeplus.modules.test.tree.dialog.mapper.TestTree1Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 组织机构Service
 *
 * @author liugf
 * @version 2018-06-12
 */
@Service
@Transactional(readOnly = true)
public class TestTree1Service extends TreeService<TestTree1Mapper, TestTree1> {

    public TestTree1 get(String id) {
        return super.get(id);
    }

    public List<TestTree1> findList(TestTree1 testTree1) {
        if (StringUtils.isNotBlank(testTree1.getParentIds())) {
            testTree1.setParentIds("," + testTree1.getParentIds() + ",");
        }
        return super.findList(testTree1);
    }

    @Transactional(readOnly = false)
    public void save(TestTree1 testTree1) {
        super.save(testTree1);
    }

    @Transactional(readOnly = false)
    public void delete(TestTree1 testTree1) {
        super.delete(testTree1);
    }

}