/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">Qtrj</a> All rights reserved.
 */
package com.jeeplus.common.utils.excel.fieldtype;

import com.google.common.collect.Lists;
import com.jeeplus.common.utils.Collections3;
import com.jeeplus.common.utils.SpringContextHolder;
import com.jeeplus.common.utils.StringUtils;
import com.jeeplus.modules.sys.entity.Role;
import com.jeeplus.modules.sys.service.SystemService;

import java.util.List;

/**
 * 字段类型转换
 *
 * @author jeeplus
 * @version 2016-5-29
 */
public class RoleListType {

    private static final SystemService systemService = SpringContextHolder.getBean(SystemService.class);

    /**
     * 获取对象值（导入）
     */
    public static Object getValue(String val) {
        List<Role> roleList = Lists.newArrayList();
        List<Role> allRoleList = systemService.findAllRole();
        for (String s : StringUtils.split(val, ",")) {
            for (Role e : allRoleList) {
                if (StringUtils.trimToEmpty(s).equals(e.getName())) {
                    roleList.add(e);
                }
            }
        }
        return roleList.size() > 0 ? roleList : null;
    }

    /**
     * 设置对象值（导出）
     */
    public static String setValue(Object val) {
        if (val != null) {
            @SuppressWarnings("unchecked")
            List<Role> roleList = (List<Role>) val;
            return Collections3.extractToString(roleList, "name", ", ");
        }
        return "";
    }

}
