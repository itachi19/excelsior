package com.gdn.wfm.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by avinashkumar on 27/06/2017 AD.
 */

@Entity
@Table(name = "param_details")
public class ParamDetail implements Serializable {


    private static final String PARAM_DETAILS_ID_SEQ = "param_details_id_seq";
    public static final String LEVEL_DETAILS_ID = "level_details_id";
    private static final String ID = "id";
    public static final String PARAM_DETAILS_ID = "param_details_id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "param_details_id_seq")
    @SequenceGenerator(name = PARAM_DETAILS_ID_SEQ, sequenceName = "param_details_id_seq", allocationSize = 1)
    @Column(name = PARAM_DETAILS_ID, nullable = false)
    private long id;

    @Column(name = "name")
    private String paramName;

    @Column(name="value" , nullable = false)
    private String paramValue;

    @ManyToOne
    @JoinColumn(name = LEVEL_DETAILS_ID )
    private LevelDetail levelDetail;

    protected ParamDetail() {}

    public ParamDetail(String paramName, String paramValue) {
        this.paramName=paramName;
        this.paramValue=paramValue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public LevelDetail getLevelDetail() {
        return levelDetail;
    }

    public void setLevelDetail(LevelDetail levelDetail) {
        this.levelDetail = levelDetail;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", paramName='").append(paramName).append('\'');
        sb.append(", paramValue='").append(paramValue).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
