package com.otava.football.otavafootball.app.model;

import java.util.List;

public class Team {

    private Integer teamId;
    private List<Player> players;
    private Club club;
    private Manager manager;
    private List<Game> gamesPlayed;
    private List<Game> gamesInFuture;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Game> getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(List<Game> gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public List<Game> getGamesInFuture() {
        return gamesInFuture;
    }

    public void setGamesInFuture(List<Game> gamesInFuture) {
        this.gamesInFuture = gamesInFuture;
    }
}
