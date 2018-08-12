package com.apurvaaeron.projects.samples.tccollector;

import com.apurvaaeron.projects.samples.tccollector.temp.BuildDataCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by apurv on 12-08-2018.
 */
@Service
public class BuildReporterService {

    @Autowired
    private TCRESTClient tcrestClient;

    public void reportBuild(TCWebhookReqDto reqDto) {
        Map buildByBuildID = tcrestClient.getBuildByBuildID(reqDto.getBuild().getBuildId());
        Map changesByBuildId = tcrestClient.getChangesByBuildId(reqDto.getBuild().getBuildId());
        Map statisticsByBuildId = tcrestClient.getBuildStatisticsByBuildId(reqDto.getBuild().getBuildId());
        BuildDataCreateRequest request =  prepareBuildDataReportRequest(buildByBuildID, changesByBuildId, statisticsByBuildId);

    }

    private BuildDataCreateRequest prepareBuildDataReportRequest(Map buildByBuildID, Map changesByBuildId, Map statisticsByBuildId) {
        //TODO
        return null;
    }


}
