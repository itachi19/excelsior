package com.gdn.wfm.model.entity;

import javax.persistence.*;
import java.io.Serializable;

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
    private long id;

    @Column(name = "label", nullable = false)
    private String levelName;

    @Column(name="parent_id" , nullable = false)
    private long parentLevelId;

    protected Level() {}

    public Level(String levelName, long parentLevelId) {
        this.levelName=levelName;
        this.parentLevelId=parentLevelId;
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
