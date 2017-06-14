package com.gdn.wfm;

import com.gdn.wfm.dao.api.LevelHierarchyRepository;
import com.gdn.wfm.model.entity.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by avinashkumar on 20/04/2017 AD.
 */
@Service
@Transactional
public class LevelRegistrationServiceImpl implements LevelRegistrationService {


    private LevelHierarchyRepository levelHierarchyRepository;

    @Autowired
    public LevelRegistrationServiceImpl(LevelHierarchyRepository levelHierarchyRepository) {
        this.levelHierarchyRepository = levelHierarchyRepository;
    }


    @Override
    public Level setUpNewLevel(String levelName, long parentLevelId) {

        Level level=new Level(levelName,parentLevelId);

        levelHierarchyRepository.save(level);

        return level;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Level> getLevelInfo(String levelName,String teamName) {
        return levelHierarchyRepository.getLevelInfo(levelName,teamName);
    }

    @Override
    public List<Level> getLevels(String levelName) {

        return levelHierarchyRepository.getLevels(levelName);
    }

    @Override
    public List<Level> getAllLevelInfo() {
        return levelHierarchyRepository.getAllLevelInfo();
    }

    @Override
    public List<Level> getAllLevelInfoInTeam(String teamName) {
        return levelHierarchyRepository.getAllLevelInfoInTeam(teamName);
    }
}
