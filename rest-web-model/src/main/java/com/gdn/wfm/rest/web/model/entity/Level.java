package com.gdn.wfm.rest.web.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by avinashkumar on 26/04/2017 AD.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Level implements Serializable {

    private long id;
    private String levelName;
    private long parentID;
    private List<LevelDetails> levelDetails;

    private Level(Builder builder) {
        id = builder.id;
        levelName = builder.levelName;
        parentID = builder.parentID;
        levelDetails=builder.levelDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public long getParentID() {
        return parentID;
    }

    public void setParentID(long parentID) {
        this.parentID = parentID;
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




    public static final class Builder {
        private long id;
        private String levelName;
        private long parentID;
        private List<LevelDetails> levelDetails;

        private Builder() {
        }

        public Builder withId(long val) {
            id = val;
            return this;
        }

        public Builder withLevelName(String val) {
            levelName = val;
            return this;
        }

        public Builder withParentID(long val) {
            parentID = val;
            return this;
        }

        public Builder withLevelDetails(List<LevelDetails> val) {
            levelDetails = val;
            return this;
        }
        public Level build() {
            return new Level(this);
        }

    }
}
