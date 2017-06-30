package com.gdn.wfm.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by avinashkumar on 27/06/2017 AD.
 */
@Entity
@Table(name = "level_details")

public class LevelDetail implements Serializable{

    private static final String LEVEL_DETAILS_ID_SEQ = "level_details_id_seq";
    public static final String LEVEL_ID = "level_id";
    private static final String ID = "id";
    public static final String LEVEL_DETAILS_ID = "level_details_id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level_details_id_seq")
    @SequenceGenerator(name = LEVEL_DETAILS_ID_SEQ, sequenceName = "level_details_id_seq", allocationSize = 1)
    @Column(name =LEVEL_DETAILS_ID, nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name="type")
    private String type;

    @Column(name = "data_source")
    private String dataSource;

    @Column(name = "query")
    private String query;

    @Column(name = "result_type")
    private String resultType;

    @ManyToOne()
    @JoinColumn(name = LEVEL_ID, referencedColumnName = "level_id",nullable = false)
    private Level level;

    @OneToMany(mappedBy = "levelDetail",cascade = CascadeType.ALL)
    private List<ParamDetail> paramDetails;

    protected LevelDetail() {}

    public LevelDetail(String name, String type, String dataSource, String query, String resultType) {
        this.name = name;
        this.type=type;
        this.dataSource=dataSource;
        this.query=query;
        this.resultType=resultType;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<ParamDetail> getParamDetails() {
        return paramDetails;
    }

    public void setParamDetails(List<ParamDetail> paramDetails) {
        this.paramDetails = paramDetails;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSoue) {
        this.dataSource = dataSource;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", dataSource='").append(dataSource).append('\'');
        sb.append(", query='").append(query).append('\'');
        sb.append(", resultType='").append(resultType).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
