package com.youran.generate.dao;

import com.youran.common.dao.DAO;
import com.youran.generate.pojo.po.CodeTemplatePO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>Title: 【代码模板】数据库操作</p>
 * <p>Description: </p>
 * @author cbb
 * @date 2019/10/24
 */
@Repository
@Mapper
public interface CodeTemplateDAO extends DAO<CodeTemplatePO> {

}


