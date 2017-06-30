package com.gdn.wfm.rest.web.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by avinashkumar on 17/06/2017 AD.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LevelDetails implements Serializable {

    private long id;

    private String name;

    private String type;

    private String dataSource;

    private String query;

    private String resultType;

    private List<ParamDetails> params;

    protected LevelDetails() {
    }

    public List<ParamDetails> getParams() {
        return params;
    }

    public void setParams(List<ParamDetails> params) {
        this.params = params;
    }

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

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
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


    private LevelDetails(LevelDetails.Builder builder) {
        id = builder.id;
        name = builder.name;
        type = builder.type;
        dataSource = builder.dataSource;
        query = builder.query;
        resultType = builder.resultType;
        params = builder.params;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private long id;

        private String name;

        private String type;

        private String dataSource;

        private String query;

        private String resultType;

        private List<ParamDetails> params;

        private Builder() {
        }

        public LevelDetails.Builder withId(long val) {
            id = val;
            return this;
        }

        public LevelDetails.Builder withType(String val) {
            type = val;
            return this;
        }

        public LevelDetails.Builder withDataSource(String val) {
            dataSource = val;
            return this;
        }

        public LevelDetails.Builder withQuery(String val) {
            query = val;
            return this;
        }

        public LevelDetails.Builder withResulType(String val) {
            resultType = val;
            return this;
        }

        public LevelDetails.Builder withName(String val) {
            name = val;
            return this;
        }

        public LevelDetails.Builder withParamDetails(List<ParamDetails> val) {
            params = val;
            return this;
        }

        public LevelDetails build() {
            return new LevelDetails(this);
        }

    }

}
