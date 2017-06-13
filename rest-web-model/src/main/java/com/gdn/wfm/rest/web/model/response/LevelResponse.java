package com.gdn.wfm.rest.web.model.response;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.gdn.wfm.rest.web.model.entity.Level;

import java.util.List;

/**
 * Created by avinashkumar on 26/04/2017 AD.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LevelResponse extends BaseResponse {

    private static final long serialVersionUID = 1;

    private Level level;

    private List<Level> levels;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public LevelResponse(boolean success, int status, Level level) {
        super(success, status);
        this.level = level;
    }

    public LevelResponse(boolean success, int status, List<Level> levels) {
        super(success, status);
        this.levels = levels;
    }



}
