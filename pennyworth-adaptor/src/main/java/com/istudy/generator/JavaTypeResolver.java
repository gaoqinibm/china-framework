package com.istudy.generator;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * Mybatis 数据库字段与Java类型对应转换关系
 * @author Baizhen on 2020/03/20 17:25.
 */
public class JavaTypeResolver extends JavaTypeResolverDefaultImpl {

    public JavaTypeResolver() {
        super();
        // TINYINT 转换成 Integer
        this.typeMap.put(-6, new JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
