package com.gdn.wfm.rest.web.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * Created by avinashkumar on 26/04/2017 AD.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Level implements Serializable {

    private long id;
    private String levelName;
    private long parentID;
    private boolean isLeaf;

    private Level(Builder builder) {
        id = builder.id;
        levelName = builder.levelName;
        parentID = builder.parentID;
        isLeaf=true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public long getId() {
        return id;
    }

    public String getLevelName() {
        return levelName;
    }

    public long getParentID() {
        return parentID;
    }

    public boolean getIsLeaf(){ return isLeaf;}

    public static final class Builder {
        private long id;
        private String levelName;
        private long parentID;
        private boolean isLeaf;

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

        public Builder withIsLeaf(boolean val) {
            isLeaf = val;
            return this;
        }

        public Level build() {
            return new Level(this);
        }

    }
}
