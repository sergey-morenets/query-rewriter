package com.example.demo;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.QueryRewriter;

public class DefaultQueryRewriter implements QueryRewriter {

    @Override
    public String rewrite(String query, Sort sort) {

        return query.replaceAll("FROM PRODUCTS", "FROM Product");
    }
}
