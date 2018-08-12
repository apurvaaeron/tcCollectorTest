package com.apurvaaeron.projects.samples.tccollector;

import com.apurvaaeron.projects.samples.tccollector.temp.BuildDataCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.NumberUtils;

import java.util.Map;

/**
 * Created by apurv on 12-08-2018.
 */
@Service
public class BuildReporterService {

    @Autowired
    private TCRESTClient tcrestClient;

    public void reportBuild(TCWebhookReqDto reqDto) {
        GetBuildByIdDto buildByBuildID = tcrestClient.getBuildByBuildID(reqDto.getBuild().getBuildId());
        GetChangesByBuildIdDto changesByBuildId = tcrestClient.getChangesByBuildId(reqDto.getBuild().getBuildId());
        GetBuildStatisticsByBuildIdDto statisticsByBuildId = tcrestClient.getBuildStatisticsByBuildId(reqDto.getBuild().getBuildId());
        BuildDataCreateRequest request =  prepareBuildDataReportRequest(buildByBuildID, changesByBuildId, statisticsByBuildId);

    }

    private BuildDataCreateRequest prepareBuildDataReportRequest(GetBuildByIdDto b, GetChangesByBuildIdDto c, GetBuildStatisticsByBuildIdDto s) {
        BuildDataCreateRequest request = new BuildDataCreateRequest();
        request.setBuildStatus(b.getState());
        request.setBuildUrl(b.getWebUrl());

        request.setEndTime(0l);//TODO
        request.setStartTime(0l);//TODO
        request.setInstanceUrl("N/A");
        request.setJobName(b.getBuildType().getProjectName());
        //TODO

                //Stats

        //TODO
        return null;
    }

    private long toLongTime(String date) {
        return 0;
    }


}
