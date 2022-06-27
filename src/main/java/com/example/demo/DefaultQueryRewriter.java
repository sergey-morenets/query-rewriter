package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.QueryRewriter;

public class DefaultQueryRewriter implements QueryRewriter {

    private static final Logger log = LoggerFactory.getLogger(DefaultQueryRewriter.class);

    @Override
    public String rewrite(String query, Sort sort) {
        log.info("Found '" + query + "'");
        String rewrittenQuery = query.replaceAll("FROM PRODUCTS", "FROM Products");
        log.info("Replaced with '" + rewrittenQuery + "'");
        return rewrittenQuery;
    }
}
