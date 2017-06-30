package com.gdn.wfm.util;

import com.gdn.wfm.LevelRegistrationService;
import com.gdn.wfm.rest.web.model.entity.Level;
import com.gdn.wfm.rest.web.model.entity.LevelDetails;
import com.gdn.wfm.rest.web.model.request.LevelRequest;
import com.gdn.wfm.rest.web.model.request.LevelRequestAttribute;
import com.gdn.wfm.rest.web.model.request.LevelRequestTeamName;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinashkumar on 27/06/2017 AD.
 */
public class LevelDetailUtil {

    private static LevelRegistrationService levelRegistrationService;

    @Autowired
    public LevelDetailUtil(LevelRegistrationService levelRegistrationService) {
        this.levelRegistrationService = levelRegistrationService;
    }

    public static LevelRequest mapLevelRequet(LevelRequestTeamName levelRequestTeamName) {

        List<com.gdn.wfm.model.entity.Level> parentLevelInfo=levelRegistrationService.getLevelInfo(levelRequestTeamName.getParentLevelName(),
                levelRequestTeamName.getTeamName());

        return LevelRequest.newBuilder().withParentID(parentLevelInfo.get(0).getId()).withLevelName(levelRequestTeamName.getLevelName())
                .withLevelRequestDetails(levelRequestTeamName.getLevelRequestDetails()).build();
    }

    public static com.gdn.wfm.model.entity.LevelDetails mapLevelDetail(LevelDetails levelDetails) {

        return new com.gdn.wfm.model.entity.LevelDetails(levelDetails.getName(),levelDetails.getType(),levelDetails.getDataSoucre()
        ,levelDetails.getQuery(),levelDetails.getResultType());
    }

    public static List<com.gdn.wfm.model.entity.LevelDetails> mapLevelDetails(List<LevelDetails> levelDetails) {

        List<com.gdn.wfm.model.entity.LevelDetails> levelDetailz = new ArrayList<>(levelDetails.size());
        levelDetails.forEach(ld -> levelDetailz.add(mapLevelDetail(ld)));
        return levelDetailz;
    }

}
