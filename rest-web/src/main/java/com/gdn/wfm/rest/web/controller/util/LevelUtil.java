package com.gdn.wfm.rest.web.controller.util;

import com.gdn.wfm.rest.web.model.entity.Level;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinashkumar on 29/04/2017 AD.
 */
public class LevelUtil {


    static Level level;
    public static Level mapLevel(com.gdn.wfm.model.entity.Level level) {

        return Level.newBuilder().withId(level.getId()).withLevelName(level.getLevelName())
                .withParentID(level.getParentLevelId()).build();
    }

    public static List<Level> mapLevels(List<com.gdn.wfm.model.entity.Level> levels) {

        List<Level> levelEntities = new ArrayList<Level>(levels.size());
        levels.forEach(level -> levelEntities.add(mapLevel(level)));
        return levelEntities;
    }

}


