package com.gdn.wfm.rest.web.controller.util;


import com.gdn.wfm.LevelRegistrationService;
import com.gdn.wfm.rest.web.model.entity.LevelDetails;
import com.gdn.wfm.rest.web.model.request.LevelRequest;
import com.gdn.wfm.rest.web.model.request.LevelRequestTeamName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinashkumar on 27/06/2017 AD.
 */
public class LevelRequestUtil {


    public static LevelRequest mapLevelRequet(LevelRequestTeamName levelRequestTeamName,List<com.gdn.wfm.model.entity.Level> parentLevelInfo) {


        return LevelRequest.newBuilder().withParentID(parentLevelInfo.get(0).getId()).withLevelName(levelRequestTeamName.getLevelName())
                .withLevelRequestDetails(levelRequestTeamName.getLevelDetails()).build();
    }

}
