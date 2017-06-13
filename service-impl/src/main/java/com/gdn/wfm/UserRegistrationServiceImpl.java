package com.gdn.wfm;

import com.gdn.wfm.dao.api.LevelHierarchyRepository;
import com.gdn.wfm.dao.api.UserRepository;
import com.gdn.wfm.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by avinashkumar on 20/04/2017 AD.
 */
public class UserRegistrationServiceImpl implements UserRegistrationService{


    private UserRepository userRepository;

    @Autowired
    public UserRegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllUsersInJob(int levelId) {
        return null;
    }
}
