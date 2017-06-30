package com.gdn.wfm.rest.web.controller.api;

import com.gdn.wfm.LevelRegistrationService;
import com.gdn.wfm.model.entity.Level;
import com.gdn.wfm.rest.web.controller.util.LevelRequestUtil;
import com.gdn.wfm.rest.web.controller.util.LevelUtil;
import com.gdn.wfm.rest.web.model.request.LevelRequest;
import com.gdn.wfm.rest.web.model.request.LevelRequestTeamName;
import com.gdn.wfm.rest.web.model.response.LevelResponse;
import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "TeamConfigController", description = "Create Team ")
@RestController
public class TeamConfigController {

  private LevelRegistrationService levelRegistrationService;

  @Autowired
  public TeamConfigController(LevelRegistrationService levelRegistrationService) {
    this.levelRegistrationService = levelRegistrationService;
  }

  @RequestMapping("/hello")
  public String sayHello(){
    return "Hello Avinash";
  }


  @RequestMapping(value="/team",method = {RequestMethod.POST},consumes = {MediaType.APPLICATION_JSON_VALUE})
  public LevelResponse setUpNewTeam(@RequestBody LevelRequest levelRequest)
  {
    LevelResponse levelResponse;
    Level team= levelRegistrationService.setUpNewLevel(levelRequest);
   // LevelDetail levelDetails=levelRegistrationService.getlevelDetails(levelRequest.getLevelRequestDetails());
    levelResponse=new LevelResponse(true,HttpStatus.OK.value(),LevelUtil.mapLevel(team));
    return levelResponse;
  }

  @RequestMapping(value="/level",method = {RequestMethod.POST},consumes = {MediaType.APPLICATION_JSON_VALUE})
  public LevelResponse addNewLevel(@RequestBody LevelRequest levelRequest)
  {
    Level newLevel=levelRegistrationService.setUpNewLevel(levelRequest);
   // LevelDetail levelDetails=levelRegistrationService.getlevelDetails(levelRequest.getLevelRequestDetails());
    return new LevelResponse(true, HttpStatus.OK.value(), LevelUtil.mapLevel(newLevel));
  }

  @RequestMapping(value="/team/level",method = {RequestMethod.POST},consumes = {MediaType.APPLICATION_JSON_VALUE})
  public LevelResponse addNewLevel(@RequestBody LevelRequestTeamName levelRequestTeamName)
  {
    List<Level> parentLevelInfo=levelRegistrationService.getLevelInfo(levelRequestTeamName.getParentLevelName(),
            levelRequestTeamName.getTeamName());
    LevelRequest levelRequest= LevelRequestUtil.mapLevelRequet(levelRequestTeamName,parentLevelInfo);
    Level newLevel=levelRegistrationService.setUpNewLevel(levelRequest);
    //LevelDetail levelDetails=levelRegistrationService.getlevelDetails(levelRequestTeamName.getLevelRequestDetails());
    return new LevelResponse(true, HttpStatus.OK.value(), LevelUtil.mapLevel(newLevel));
    //return newLevel;
  }

  public List<Level> getLevelInfo(String parentLevelName,String teamName)
  {
    List<Level> levelInfo=levelRegistrationService.getLevelInfo(parentLevelName,teamName);
    return levelInfo;
  }

  @RequestMapping(value = "team/level/{name}", method = {RequestMethod.GET})
  public  LevelResponse searchbyLevelName(@PathVariable("name") String levelName)
  {
    LevelResponse levelResponse = null;
    List<Level> levels=levelRegistrationService.getLevels(levelName);
    levelResponse=new LevelResponse(true,HttpStatus.OK.value(),  LevelUtil.mapLevels(levels));
    return levelResponse;
  }

  @RequestMapping(value = "levels", method = {RequestMethod.GET})
  public LevelResponse getAllLevelInfo()
  {
    LevelResponse levelResponse = null;
    List<Level> levels=levelRegistrationService.getAllLevelInfo();
    levelResponse=new LevelResponse(true,HttpStatus.OK.value(), LevelUtil.mapLevels(levels));
    return levelResponse;
  }

  @RequestMapping(value = "team/levels", method = {RequestMethod.GET})
  public LevelResponse getAllLevelInfoInTeam(@RequestParam(value = "teamName") String teamName)
  {
    LevelResponse levelResponse = null;
    List<Level> levels=levelRegistrationService.getAllLevelInfoInTeam(teamName);
    levelResponse=new LevelResponse(true,HttpStatus.OK.value(), LevelUtil.mapLevels(levels));
    return levelResponse;
  }
}
