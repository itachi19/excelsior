package com.gdn.wfm.util;

;
import com.gdn.wfm.model.entity.LevelDetail;
import com.gdn.wfm.model.entity.ParamDetail;
import com.gdn.wfm.rest.web.model.entity.LevelDetails;
import com.gdn.wfm.rest.web.model.entity.ParamDetails;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinashkumar on 27/06/2017 AD.
 */
public class LevelDetailUtil {


    public static LevelDetail mapLevelDetail(LevelDetails levelDetails) {

        return new LevelDetail(levelDetails.getName(),levelDetails.getType(),levelDetails.getDataSource()
        ,levelDetails.getQuery(),levelDetails.getResultType());
    }



    public static List<LevelDetail> mapLevelDetails(List<LevelDetails> levelDetails, com.gdn.wfm.model.entity.Level level) {

        List<LevelDetail> levelDetailList = new ArrayList<LevelDetail>();

        for(int i=0;i<levelDetails.size();i++)
        {
            LevelDetail levelDetail = mapLevelDetail(levelDetails.get(i));
            levelDetail.setParamDetails(mapParamDetails(levelDetails.get(i).getParams(),levelDetail));
            levelDetail.setLevel(level);
            levelDetailList.add(levelDetail);

        }
        return levelDetailList;
    }




    public static ParamDetail mapParamDetail(ParamDetails paramDetails) {

        return new ParamDetail(paramDetails.getParamName(),paramDetails.getParamValue());
    }



    public static List<ParamDetail> mapParamDetails(List<ParamDetails> paramDetails, LevelDetail levelDetail) {

        List<ParamDetail> paramDetailz = new ArrayList<ParamDetail>();
        for(int i=0;i<paramDetails.size();i++)
        {
            ParamDetail pd=mapParamDetail(paramDetails.get(i));
            pd.setLevelDetail(levelDetail);
            paramDetailz.add(pd);
        }
        //  paramDetails.forEach(pd -> paramDetailz.add(mapParamDetail(pd)));
        return paramDetailz;
    }

}
