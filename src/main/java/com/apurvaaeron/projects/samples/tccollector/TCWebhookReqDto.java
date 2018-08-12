package com.apurvaaeron.projects.samples.tccollector;

/**
 * Created by apurv on 12-08-2018.
 */
public class TCWebhookReqDto {
    private TCBuildDto build;

    public TCBuildDto getBuild() {
        return build;
    }

    public void setBuild(TCBuildDto build) {
        this.build = build;
    }

    @Override
    public String toString() {
        return "TCWebhookReqDto{" +
                "build=" + build +
                '}';
    }
}
