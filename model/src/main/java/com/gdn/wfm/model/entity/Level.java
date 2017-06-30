package com.gdn.wfm.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by avinashkumar on 20/04/2017 AD.
 */

@Entity
@Table(name = "level_hierarchy")

public class  Level implements Serializable {

    private static final String LEVEL_ID_SEQ = "level_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level_id_seq")
    @SequenceGenerator(name = LEVEL_ID_SEQ, sequenceName = "level_id_seq", allocationSize = 1)
    @Column(name = "level_id")
    private long id;

    @Column(name = "label")
    private String levelName;

    @Column(name="parent_id" )
    private long parentLevelId;

    @OneToMany(mappedBy = "level",cascade = CascadeType.ALL)
    private List<LevelDetail> levelDetails;


    protected Level() {}

    public Level(String levelName, long parentLevelId) {
        this.levelName=levelName;
        this.parentLevelId=parentLevelId;
    }


    public List<LevelDetail> getLevelDetails() {
        return levelDetails;
    }

    public void setLevelDetails(List<LevelDetail> levelDetails) {
        this.levelDetails = levelDetails;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public long getParentLevelId() {
        return parentLevelId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", levelName='").append(levelName).append('\'');
        sb.append(", parentLevelId='").append(parentLevelId).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
