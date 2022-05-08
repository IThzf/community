package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("alphaDaoHibernateImpl2")
@Primary
public class AlphaDaoHibernateImpl2 implements AlphaDao {

    @Override
    public String select() {
        return "Hello2";
    }
}
