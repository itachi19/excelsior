package com.gdn.wfm;

import com.gdn.wfm.model.entity.Level;
import com.gdn.wfm.rest.web.model.entity.LevelDetails;
import com.gdn.wfm.rest.web.model.request.LevelRequest;
import com.gdn.wfm.rest.web.model.request.LevelRequestAttribute;

import java.util.List;
/**
 * Created by avinashkumar on 20/04/2017 AD.
 */
public interface LevelRegistrationService {

    Level setUpNewLevel(LevelRequest levelRequest);

    List<Level> getLevelInfo(String levelName,String teamName);

    List<Level> getLevels(String levelName);

    List<Level> getAllLevelInfo();

    List<Level> getAllLevelInfoInTeam(String teamName);

}
