package com.gdn.wfm.rest.web.model.entity;

 import com.fasterxml.jackson.annotation.JsonInclude;
 import java.io.Serializable;
 import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String userName;
    private long jobId;

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }



    private User(Builder builder) {
        setId(builder.id);
        setUserName(builder.userName);
        setJobId(builder.jobId);
    }

    public static Builder newBuilder() {
        return new Builder();
    }



    public static final class Builder {
        private long id;
        private String userName;
        private long jobId;

        private Builder() {
        }

        public Builder withId(long val) {
            id = val;
            return this;
        }

        public Builder withUserName(String val) {
            userName = val;
            return this;
        }
        public Builder withJobId(long val) {
            jobId = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
