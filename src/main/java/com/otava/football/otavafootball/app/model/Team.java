package com.otava.football.otavafootball.app.model;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

public class Team {

    private Integer teamId;
    private List<Player> players;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id")
    private Club club;
    private Manager manager;
//    make two classes of past and future
    private List<Game> gamesPlayed;
    @ManyToOne
    @JoinColumn(name = "team_id")
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
