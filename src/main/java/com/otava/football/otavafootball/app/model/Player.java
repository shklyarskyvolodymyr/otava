package com.otava.football.otavafootball.app.model;

import java.util.Date;

public class Player {

    private Integer playerId;
    private String name;
    private Byte number;
    private Date bornDate;
    private Team team;
    private String position;
    private byte goalkeeping;
    private byte defending;
    private byte Middlefield;
    private byte attack;
    private byte shoots;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getNumber() {
        return number;
    }

    public void setNumber(Byte number) {
        this.number = number;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public byte getGoalkeeping() {
        return goalkeeping;
    }

    public void setGoalkeeping(byte goalkeeping) {
        this.goalkeeping = goalkeeping;
    }

    public byte getDefending() {
        return defending;
    }

    public void setDefending(byte defending) {
        this.defending = defending;
    }

    public byte getMiddlefield() {
        return Middlefield;
    }

    public void setMiddlefield(byte middlefield) {
        Middlefield = middlefield;
    }

    public byte getAttack() {
        return attack;
    }

    public void setAttack(byte attack) {
        this.attack = attack;
    }

    public byte getShoots() {
        return shoots;
    }

    public void setShoots(byte shoots) {
        this.shoots = shoots;
    }
}
