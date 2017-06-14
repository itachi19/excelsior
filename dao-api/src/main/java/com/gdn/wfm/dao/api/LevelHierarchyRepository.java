package com.gdn.wfm.dao.api;

import com.gdn.wfm.model.entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by avinashkumar on 20/04/2017 AD.
 */
public interface LevelHierarchyRepository extends JpaRepository<Level,Long> {

    String LEVEL_NAME = "levelName";
    String TEAM_NAME="teamName";

    @Query(value=" WITH RECURSIVE levels_cte(id, label, parent_id, depth,team_id) AS(" +
            " SELECT tn.id, tn.label, tn.parent_id , CAST('1' AS INTEGER) AS depth,CAST(tn.id AS INTEGER) AS team_id"+
            " FROM level_hierarchy AS tn "+
            " WHERE tn.parent_id = 1"+
            "UNION ALL"+
            " SELECT c.id, c.label, c.parent_id, p.depth + 1 AS depth," +
            "        (p.team_id)"+
            " FROM levels_cte AS p, level_hierarchy AS c "+
            " WHERE c.parent_id = p.id"+
            ")"+
            "SELECT * FROM levels_cte AS n WHERE n.label = :levelName AND n.team_id= " +
            "   (SELECT t.id FROM level_hierarchy AS t WHERE t.label=:teamName )",nativeQuery = true)

    List<Level> getLevelInfo(@Param(LEVEL_NAME) String levelName, @Param(TEAM_NAME) String teamName);

    @Query(value= "WITH RECURSIVE levels_cte(id, label, parent_id, depth,team_id) AS(" +
            " SELECT tn.id, tn.label, tn.parent_id , CAST('1' AS INTEGER) AS depth,CAST(tn.id AS INTEGER) AS team_id"+
            " FROM level_hierarchy AS tn "+
            " WHERE tn.parent_id = 0"+
            "UNION ALL"+
            " SELECT c.id, c.label, c.parent_id, p.depth + 1 AS depth," +
            "        (p.team_id)"+
            " FROM levels_cte AS p, level_hierarchy AS c "+
            " WHERE c.parent_id = p.id"+
            ")"+
            "SELECT * FROM levels_cte AS n ORDER BY n.id ASC",nativeQuery = true)

    List<Level> getAllLevelInfo();



    @Query(value=" SELECT * from level_hierarchy as l" +
            "    WHERE l.label = :levelName",nativeQuery = true)

    List<Level> getLevels(@Param(LEVEL_NAME) String levelName);



    @Query(value= "WITH RECURSIVE levels_cte(id, label, parent_id, depth,team_id) AS(" +
            " SELECT tn.id, tn.label, tn.parent_id , CAST('1' AS INTEGER) AS depth,CAST(tn.id AS INTEGER) AS team_id"+
            " FROM level_hierarchy AS tn "+
            " WHERE tn.parent_id = 1"+
            "UNION ALL"+
            " SELECT c.id, c.label, c.parent_id, p.depth + 1 AS depth," +
            "        (p.team_id)"+
            " FROM levels_cte AS p, level_hierarchy AS c "+
            " WHERE c.parent_id = p.id"+
            ")"+
            "SELECT * FROM levels_cte AS n WHERE n.team_id= " +
            "   (SELECT t.id FROM level_hierarchy AS t WHERE t.label=:teamName )",nativeQuery = true)
    List<Level> getAllLevelInfoInTeam(@Param(TEAM_NAME) String teamName);
}
