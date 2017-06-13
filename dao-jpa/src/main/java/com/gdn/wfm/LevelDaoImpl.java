package com.gdn.wfm;

import com.gdn.wfm.dao.api.LevelDao;
import com.gdn.wfm.dao.api.LevelHierarchyRepository;
import com.gdn.wfm.dao.api.UserRepository;
import com.gdn.wfm.model.entity.Level;
import com.gdn.wfm.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by avinashkumar on 08/06/2017 AD.
 */
@Component
public class LevelDaoImpl implements LevelDao{

    public static final String USERS_JOB_LEVEL_SQL = "SELECT COUNT(users) FROM user_job_table t WHERE t.job==:jobName"
                                                     +"AND t.levelName=:levelName";

    private LevelHierarchyRepository levelHierarchyRepository;

    private UserRepository userRepository;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    public LevelDaoImpl(LevelHierarchyRepository levelHierarchyRepository, UserRepository userRepository) {
        this.levelHierarchyRepository = levelHierarchyRepository;
        this.userRepository=userRepository;
    }


    @Override
    public List<User> getUsersWithJob(String jobLevelName, String levelName) {
        Query query = entityManager.createNativeQuery(
                USERS_JOB_LEVEL_SQL,
                "User");

        query.setParameter("1", jobLevelName);
        query.setParameter("2", levelName);
        List<User>  users = query.getResultList();
        return users;
    }
}
