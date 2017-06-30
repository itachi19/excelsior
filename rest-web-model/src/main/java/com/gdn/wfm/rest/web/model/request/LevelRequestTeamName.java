package com.gdn.wfm.rest.web.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gdn.wfm.rest.web.model.entity.LevelDetails;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by avinashkumar on 14/06/2017 AD.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LevelRequestTeamName {

    private static final long serialVersionUID = 1;

    @NotNull
    @Size(min = 5, max = 50, message = "error.level.name")
    private String levelName;

    private String parentLevelName;
    private String teamName;
    @NotNull
    private List<LevelDetails> levelDetails;

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

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

    public List<LevelDetails> getLevelDetails() {
        return levelDetails;
    }

    public void setLevelDetails(List<LevelDetails> levelDetails) {
        this.levelDetails = levelDetails;
    }



    /**
     * default constructor.
     */
    public LevelRequestTeamName() {}

    public LevelRequestTeamName(String levelName,String parentLevelName,String teamName,List<LevelDetails> levelDetails) {
        this.levelName = levelName;
        this.parentLevelName=parentLevelName;
        this.teamName=teamName;
        this.levelDetails=levelDetails;
    }

}
