package com.gdn.wfm.rest.web.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Map;

/**
 * Created by avinashkumar on 15/06/2017 AD.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LevelRequestAttribute {

    private static final long serialVersionUID = 1;


    private String name;

    private String type;

    private String dataSoucre;

    private String query;

    private Map params;

    private String resultType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataSoucre() {
        return dataSoucre;
    }

    public void setDataSoucre(String dataSoucre) {
        this.dataSoucre = dataSoucre;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Map getParams() {
        return params;
    }

    public void setParams(Map params) {
        this.params = params;
    }

    /**
     * default constructor.
     */
    public LevelRequestAttribute() {}

    public LevelRequestAttribute(String name,String type,String dataSource,String query,Map params,String resultType) {
        this.name = name;
        this.type=type;
        this.dataSoucre=dataSource;
        this.query=query;
        this.params=params;
        this.resultType=resultType;
    }

}
