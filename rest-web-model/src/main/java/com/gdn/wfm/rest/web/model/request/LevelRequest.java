package com.gdn.wfm.rest.web.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by avinashkumar on 29/04/2017 AD.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LevelRequest implements Serializable{

    private static final long serialVersionUID = 1;

    @NotNull
    @Size(min = 5, max = 50, message = "error.level.name")
    private String levelName;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private long parentId;

    private String description;

    /**
     * default constructor.
     */
    public LevelRequest() {}

    public LevelRequest(String levelName,long parentId) {
        this.levelName = levelName;
        this.parentId=parentId;
    }


}
