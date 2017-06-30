package com.gdn.wfm.rest.web.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gdn.wfm.rest.web.model.entity.Level;
import com.gdn.wfm.rest.web.model.entity.LevelDetails;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by avinashkumar on 29/04/2017 AD.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LevelRequest implements Serializable{

    private static final long serialVersionUID = 1;

    @NotNull
    private String levelName;
    @NotNull
    private long parentId;
    @NotNull
    private List<LevelDetails> levelDetails;

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public List<LevelDetails> getLevelDetails() {
        return levelDetails;
    }

    public void setLevelDetails(List<LevelDetails> levelDetails) {
        this.levelDetails = levelDetails;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public LevelRequest() {}


    private LevelRequest(LevelRequest.Builder builder) {
        levelName = builder.levelName;
        parentId = builder.parentId;
        levelDetails=builder.levelDetails;
    }

    public static final class Builder {
        private String levelName;
        private long parentId;
        private List<LevelDetails> levelDetails;

        private Builder() {
        }

        public LevelRequest.Builder withLevelName(String val) {
            levelName = val;
            return this;
        }

        public LevelRequest.Builder withParentID(long val) {
            parentId = val;
            return this;
        }

        public LevelRequest.Builder withLevelRequestDetails(List<LevelDetails> val) {
            levelDetails = val;
            return this;
        }
        public LevelRequest build() {
            return new LevelRequest(this);
        }

    }

}
