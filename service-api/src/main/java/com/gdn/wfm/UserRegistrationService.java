package com.gdn.wfm;


import com.gdn.wfm.model.entity.User;

import java.util.List;

public interface UserRegistrationService {

    List<User> getAllUsers();

    List<User> getAllUsersInJob(int levelId);

}