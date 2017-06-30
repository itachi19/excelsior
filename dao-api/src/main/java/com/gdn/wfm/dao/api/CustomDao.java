package com.gdn.wfm.dao.api;

import com.gdn.wfm.model.entity.User;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by avinashkumar on 15/06/2017 AD.
 */
public interface CustomDao {

    public String getQueryResult(String query,Map params,String resultType);

}
