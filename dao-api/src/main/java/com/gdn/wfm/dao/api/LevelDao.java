package com.gdn.wfm.dao.api;

import com.gdn.wfm.model.entity.Level;
import com.gdn.wfm.model.entity.User;

import java.util.List;

/**
 * Created by avinashkumar on 08/06/2017 AD.
 */
public interface LevelDao {

    List<User> getUsersWithJob(String jobLevelName, String levelName);
}
