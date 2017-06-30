package com.gdn.wfm.rest.web.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by avinashkumar on 27/06/2017 AD.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamDetails {

    private long id;

    private String paramName;

    private String paramValue;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    protected ParamDetails() {}

    public ParamDetails(String paramName, String paramValue) {
        this.paramName=paramName;
        this.paramValue=paramValue;
    }

    private ParamDetails(ParamDetails.Builder builder) {
        id = builder.id;
        paramName=builder.paramName;
        paramValue=builder.paramValue;
    }

    public static ParamDetails.Builder newBuilder() {
        return new ParamDetails.Builder();
    }

    public static final class Builder {
        private long id;

        private String paramName;

        private String paramValue;

        private Builder() {
        }

        public ParamDetails.Builder withId(long val) {
            id = val;
            return this;
        }

        public ParamDetails.Builder withParamName(String val) {
            paramName = val;
            return this;
        }

        public ParamDetails.Builder withParamValue(String val) {
            paramValue = val;
            return this;
        }


        public ParamDetails build() {
            return new ParamDetails(this);
        }

    }

}
