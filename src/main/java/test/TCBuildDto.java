package test;

import java.util.List;

/**
 * Created by apurv on 12-08-2018.
 */
public class TCBuildDto {
    private String buildStatus;
    private String buildResult;
    private String buildResultPrevious;
    private String buildResultDelta;
    private String notifyType;
    private String buildFullName;
    private String buildName;
    private String buildId;
    private String buildTypeId;
    private String buildInternalTypeId;
    private String buildExternalTypeId;
    private String buildStatusUrl;
    private String buildStatusHtml;
    private String rootUrl;
    private String projectName;
    private String projectId;
    private String projectInternalId;
    private String projectExternalId;
    private String buildNumber;
    private String agentName;
    private String agentOs;
    private String agentHostname;
    private String triggeredBy;
    private String message;
    private String text;
    private String buildStateDescription;
    private List<String> buildRunners;
    private List<String> buildTags;
    private List<TCProperty> extraParameters;//name/value
    private List<TCProperty> teamcityProperties;
    private List<TCChangeWrapper> changes;

    public String getBuildStatus() {
        return buildStatus;
    }

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    public String getBuildResult() {
        return buildResult;
    }

    public void setBuildResult(String buildResult) {
        this.buildResult = buildResult;
    }

    public String getBuildResultPrevious() {
        return buildResultPrevious;
    }

    public void setBuildResultPrevious(String buildResultPrevious) {
        this.buildResultPrevious = buildResultPrevious;
    }

    public String getBuildResultDelta() {
        return buildResultDelta;
    }

    public void setBuildResultDelta(String buildResultDelta) {
        this.buildResultDelta = buildResultDelta;
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getBuildFullName() {
        return buildFullName;
    }

    public void setBuildFullName(String buildFullName) {
        this.buildFullName = buildFullName;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getBuildTypeId() {
        return buildTypeId;
    }

    public void setBuildTypeId(String buildTypeId) {
        this.buildTypeId = buildTypeId;
    }

    public String getBuildInternalTypeId() {
        return buildInternalTypeId;
    }

    public void setBuildInternalTypeId(String buildInternalTypeId) {
        this.buildInternalTypeId = buildInternalTypeId;
    }

    public String getBuildExternalTypeId() {
        return buildExternalTypeId;
    }

    public void setBuildExternalTypeId(String buildExternalTypeId) {
        this.buildExternalTypeId = buildExternalTypeId;
    }

    public String getBuildStatusUrl() {
        return buildStatusUrl;
    }

    public void setBuildStatusUrl(String buildStatusUrl) {
        this.buildStatusUrl = buildStatusUrl;
    }

    public String getBuildStatusHtml() {
        return buildStatusHtml;
    }

    public void setBuildStatusHtml(String buildStatusHtml) {
        this.buildStatusHtml = buildStatusHtml;
    }

    public String getRootUrl() {
        return rootUrl;
    }

    public void setRootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectInternalId() {
        return projectInternalId;
    }

    public void setProjectInternalId(String projectInternalId) {
        this.projectInternalId = projectInternalId;
    }

    public String getProjectExternalId() {
        return projectExternalId;
    }

    public void setProjectExternalId(String projectExternalId) {
        this.projectExternalId = projectExternalId;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentOs() {
        return agentOs;
    }

    public void setAgentOs(String agentOs) {
        this.agentOs = agentOs;
    }

    public String getAgentHostname() {
        return agentHostname;
    }

    public void setAgentHostname(String agentHostname) {
        this.agentHostname = agentHostname;
    }

    public String getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBuildStateDescription() {
        return buildStateDescription;
    }

    public void setBuildStateDescription(String buildStateDescription) {
        this.buildStateDescription = buildStateDescription;
    }

    public List<String> getBuildRunners() {
        return buildRunners;
    }

    public void setBuildRunners(List<String> buildRunners) {
        this.buildRunners = buildRunners;
    }

    public List<String> getBuildTags() {
        return buildTags;
    }

    public void setBuildTags(List<String> buildTags) {
        this.buildTags = buildTags;
    }

    public List<TCProperty> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(List<TCProperty> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public List<TCProperty> getTeamcityProperties() {
        return teamcityProperties;
    }

    public void setTeamcityProperties(List<TCProperty> teamcityProperties) {
        this.teamcityProperties = teamcityProperties;
    }

    public List<TCChangeWrapper> getChanges() {
        return changes;
    }

    public void setChanges(List<TCChangeWrapper> changes) {
        this.changes = changes;
    }

    @Override
    public String toString() {
        return "TCBuildDto{" +
                "buildStatus='" + buildStatus + '\'' +
                ", buildResult='" + buildResult + '\'' +
                ", buildResultPrevious='" + buildResultPrevious + '\'' +
                ", buildResultDelta='" + buildResultDelta + '\'' +
                ", notifyType='" + notifyType + '\'' +
                ", buildFullName='" + buildFullName + '\'' +
                ", buildName='" + buildName + '\'' +
                ", buildId='" + buildId + '\'' +
                ", buildTypeId='" + buildTypeId + '\'' +
                ", buildInternalTypeId='" + buildInternalTypeId + '\'' +
                ", buildExternalTypeId='" + buildExternalTypeId + '\'' +
                ", buildStatusUrl='" + buildStatusUrl + '\'' +
                ", buildStatusHtml='" + buildStatusHtml + '\'' +
                ", rootUrl='" + rootUrl + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectId='" + projectId + '\'' +
                ", projectInternalId='" + projectInternalId + '\'' +
                ", projectExternalId='" + projectExternalId + '\'' +
                ", buildNumber='" + buildNumber + '\'' +
                ", agentName='" + agentName + '\'' +
                ", agentOs='" + agentOs + '\'' +
                ", agentHostname='" + agentHostname + '\'' +
                ", triggeredBy='" + triggeredBy + '\'' +
                ", message='" + message + '\'' +
                ", text='" + text + '\'' +
                ", buildStateDescription='" + buildStateDescription + '\'' +
                ", buildRunners=" + buildRunners +
                ", buildTags=" + buildTags +
                ", extraParameters=" + extraParameters +
                ", teamcityProperties=" + teamcityProperties +
                ", changes=" + changes +
                '}';
    }
}
