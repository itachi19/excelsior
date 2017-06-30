package com.gdn.wfm;

import com.gdn.wfm.dao.api.CustomDao;

import java.sql.ResultSet;
import java.util.Map;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by avinashkumar on 15/06/2017 AD.
 */
@Repository
public class CustomDaoImpl extends NamedParameterJdbcDaoSupport implements CustomDao{

    private String type;
    private String query;
    private Map params;
    private String resultType;


    private Map<String, ResultHandler> resultHandlerMap;

    @Autowired
    public CustomDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }

    public String getQueryResult(String query,Map params,String resultType)
    {

            return getNamedParameterJdbcTemplate().queryForObject(query,params, String.class);
    }
}
