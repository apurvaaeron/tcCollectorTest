package com.apurvaaeron.projects.samples.tccollector;

import java.util.List;

/**
 * Created by apurv on 12-08-2018.
 */
public class TCChange {
    private List<String> files;
    private String comment;
    private String vcsRoot;
    private String username;

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getVcsRoot() {
        return vcsRoot;
    }

    public void setVcsRoot(String vcsRoot) {
        this.vcsRoot = vcsRoot;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "TCChange{" +
                "files=" + files +
                ", comment='" + comment + '\'' +
                ", vcsRoot='" + vcsRoot + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
