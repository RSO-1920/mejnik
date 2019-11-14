package controllers;

import java.util.List;

public class MejnikDTO {
    private List<String> clani;
    private String opis_projekta;
    private List<String> mikrostoritve;
    private List<String> github;
    private List<String> travis;
    private List<String> dockerhub;

    public List<String> getClani() {
        return clani;
    }
    public List<String> getDockerhub() {
        return dockerhub;
    }
    public List<String> getGithub() {
        return github;
    }
    public List<String> getMikrostoritve() {
        return mikrostoritve;
    }

    public List<String> getTravis() {
        return travis;
    }

    public String getOpis_projekta() {
        return opis_projekta;
    }

    public void setClani(List<String> clani) {
        this.clani = clani;
    }

    public void setDockerhub(List<String> dockerhub) {
        this.dockerhub = dockerhub;
    }

    public void setGithub(List<String> github) {
        this.github = github;
    }

    public void setMikrostoritve(List<String> mikrostoritve) {
        this.mikrostoritve = mikrostoritve;
    }

    public void setOpis_projekta(String opis_projekta) {
        this.opis_projekta = opis_projekta;
    }

    public void setTravis(List<String> travis) {
        this.travis = travis;
    }
}
