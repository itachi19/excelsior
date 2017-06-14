package com.gdn.wfm.rest.web.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by avinashkumar on 14/06/2017 AD.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LevelRequestTeamName {

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

    private String parentLevelName;
    private String teamName;

    public String getParentLevelName() {
        return parentLevelName;
    }

    public void setParentLevelName(String parentLevelName) {
        this.parentLevelName = parentLevelName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * default constructor.
     */
    public LevelRequestTeamName() {}

    public LevelRequestTeamName(String levelName,String parentLevelName,String teamName) {
        this.levelName = levelName;
        this.parentLevelName=parentLevelName;
        this.teamName=teamName;
    }

}
