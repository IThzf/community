package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alpha1")
public class AlphaDaoHibernateImpl implements AlphaDao {

    @Override
    public String select() {
        return "Hello";
    }
}
