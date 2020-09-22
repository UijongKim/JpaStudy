package com.bluearin.jpastudy3.support;

import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

public class CustomMysqlDialect extends MySQL5Dialect {
    public CustomMysqlDialect() {
        super();
        registerFunction("sf_com_enckey", new StandardSQLFunction("sf_com_enckey", StandardBasicTypes.STRING));
    }
}
