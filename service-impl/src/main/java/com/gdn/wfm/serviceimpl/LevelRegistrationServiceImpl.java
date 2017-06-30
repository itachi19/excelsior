package com.gdn.wfm;

import com.gdn.wfm.dao.api.CustomDao;
import com.gdn.wfm.dao.api.LevelDetailsRepository;
import com.gdn.wfm.dao.api.LevelHierarchyRepository;
import com.gdn.wfm.dao.api.ParamDetailsRepository;
import com.gdn.wfm.model.entity.Level;
import com.gdn.wfm.rest.web.model.entity.LevelDetails;
import com.gdn.wfm.rest.web.model.request.LevelRequest;
import com.gdn.wfm.rest.web.model.request.LevelRequestAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by avinashkumar on 20/04/2017 AD.
 */
@Service
@Transactional
public class LevelRegistrationServiceImpl implements LevelRegistrationService {


    private LevelHierarchyRepository levelHierarchyRepository;

    private LevelDetailsRepository levelDetailsRepository;

    private ParamDetailsRepository paramDetailsRepository;

    private CustomDao customDao;

    @Autowired
    public LevelRegistrationServiceImpl(LevelHierarchyRepository levelHierarchyRepository, LevelDetailsRepository
                                        levelDetailsRepository, ParamDetailsRepository paramDetailsRepository,
                                        CustomDao customDao) {
        this.levelHierarchyRepository = levelHierarchyRepository;
        this.levelDetailsRepository = levelDetailsRepository;
        this.paramDetailsRepository=paramDetailsRepository;
        this.customDao=customDao;
    }


    @Override
    public Level setUpNewLevel(LevelRequest levelRequest) {

        Level level=new Level(levelRequest.getLevelName(),levelRequest.getParentId());
        level.setLevelDetailsIds(LevelRequestUtil.mapLevelDetails(levelRequest.getLevelRequestDetails());

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

    @Override
    public LevelDetails getlevelDetails(List<LevelRequestAttribute> levelRequestAttribute) {

        Map<String,String> queryResult=new HashMap<String,String>();
        for(int i=0;i<levelRequestAttribute.size();i++)
        {
            LevelRequestAttribute attribute=levelRequestAttribute.get(i);
            queryResult.put(attribute.getName()
                    ,customDao.getQueryResult(attribute.getQuery(),attribute.getParams(),attribute.getResultType()));
        }
        LevelDetails levelDetails= LevelDetails.newBuilder().withLevelDetails(queryResult).build();
        return null;
    }
}
