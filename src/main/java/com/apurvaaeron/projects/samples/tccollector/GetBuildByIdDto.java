package com.apurvaaeron.projects.samples.tccollector;

import java.util.ArrayList;
import java.util.List;

public class GetBuildByIdDto {
    private float id;
    private String buildTypeId;
    private String state;
    private String branchName;
    private String href;
    private String webUrl;
    private BuildType BuildTypeObject;
    private String waitReason;
    private String queuedDate;
    private Triggered TriggeredObject;
    private LastChanges LastChangesObject;
    private Changes ChangesObject;
    private Revisions RevisionsObject;
    private CompatibleAgents CompatibleAgentsObject;
    private Artifacts ArtifactsObject;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getBuildTypeId() {
        return buildTypeId;
    }

    public String getState() {
        return state;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getHref() {
        return href;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public BuildType getBuildType() {
        return BuildTypeObject;
    }

    public String getWaitReason() {
        return waitReason;
    }

    public String getQueuedDate() {
        return queuedDate;
    }

    public Triggered getTriggered() {
        return TriggeredObject;
    }

    public LastChanges getLastChanges() {
        return LastChangesObject;
    }

    public Changes getChanges() {
        return ChangesObject;
    }

    public Revisions getRevisions() {
        return RevisionsObject;
    }

    public CompatibleAgents getCompatibleAgents() {
        return CompatibleAgentsObject;
    }

    public Artifacts getArtifacts() {
        return ArtifactsObject;
    }

    // Setter Methods

    public void setId( float id ) {
        this.id = id;
    }

    public void setBuildTypeId( String buildTypeId ) {
        this.buildTypeId = buildTypeId;
    }

    public void setState( String state ) {
        this.state = state;
    }

    public void setBranchName( String branchName ) {
        this.branchName = branchName;
    }

    public void setHref( String href ) {
        this.href = href;
    }

    public void setWebUrl( String webUrl ) {
        this.webUrl = webUrl;
    }

    public void setBuildType( BuildType buildTypeObject ) {
        this.BuildTypeObject = buildTypeObject;
    }

    public void setWaitReason( String waitReason ) {
        this.waitReason = waitReason;
    }

    public void setQueuedDate( String queuedDate ) {
        this.queuedDate = queuedDate;
    }

    public void setTriggered( Triggered triggeredObject ) {
        this.TriggeredObject = triggeredObject;
    }

    public void setLastChanges( LastChanges lastChangesObject ) {
        this.LastChangesObject = lastChangesObject;
    }

    public void setChanges( Changes changesObject ) {
        this.ChangesObject = changesObject;
    }

    public void setRevisions( Revisions revisionsObject ) {
        this.RevisionsObject = revisionsObject;
    }

    public void setCompatibleAgents( CompatibleAgents compatibleAgentsObject ) {
        this.CompatibleAgentsObject = compatibleAgentsObject;
    }

    public void setArtifacts( Artifacts artifactsObject ) {
        this.ArtifactsObject = artifactsObject;
    }
}

class Artifacts {
    private String href;


    // Getter Methods

    public String getHref() {
        return href;
    }

    // Setter Methods

    public void setHref( String href ) {
        this.href = href;
    }
}
class CompatibleAgents {
    private String href;


    // Getter Methods

    public String getHref() {
        return href;
    }

    // Setter Methods

    public void setHref( String href ) {
        this.href = href;
    }
}
class Revisions {
    private float count;
    List<Object> revision = new ArrayList<Object>();


    // Getter Methods

    public float getCount() {
        return count;
    }

    // Setter Methods

    public void setCount( float count ) {
        this.count = count;
    }
}
class Changes {
    private String href;


    // Getter Methods

    public String getHref() {
        return href;
    }

    // Setter Methods

    public void setHref( String href ) {
        this.href = href;
    }
}
class LastChanges {
    ArrayList<Object> change = new ArrayList<Object>();
    private float count;


    // Getter Methods

    public float getCount() {
        return count;
    }

    // Setter Methods

    public void setCount( float count ) {
        this.count = count;
    }
}
class Triggered {
    private String type;
    private String details;
    private String date;


    // Getter Methods

    public String getType() {
        return type;
    }

    public String getDetails() {
        return details;
    }

    public String getDate() {
        return date;
    }

    // Setter Methods

    public void setType( String type ) {
        this.type = type;
    }

    public void setDetails( String details ) {
        this.details = details;
    }

    public void setDate( String date ) {
        this.date = date;
    }
}
class BuildType {
    private String id;
    private String name;
    private String projectName;
    private String projectId;
    private String href;
    private String webUrl;


    // Getter Methods

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getHref() {
        return href;
    }

    public String getWebUrl() {
        return webUrl;
    }

    // Setter Methods

    public void setId( String id ) {
        this.id = id;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setProjectName( String projectName ) {
        this.projectName = projectName;
    }

    public void setProjectId( String projectId ) {
        this.projectId = projectId;
    }

    public void setHref( String href ) {
        this.href = href;
    }

    public void setWebUrl( String webUrl ) {
        this.webUrl = webUrl;
    }
}