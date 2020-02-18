package com.otava.football.otavafootball.app.model;

import java.util.Date;

public class Manager {

    private Integer managerId;
    private Integer age;
    private Date connected;
    private Team team;
    private Club club;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getConnected() {
        return connected;
    }

    public void setConnected(Date connected) {
        this.connected = connected;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
