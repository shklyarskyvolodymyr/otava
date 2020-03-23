package com.otava.football.otavafootball.app.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "team")
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "team_id", unique = true, nullable = false)
  private Integer teamId;

  @OneToMany(mappedBy = "team")
  private List<Player> players;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "club_id")
  private Club club;

  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "manager")
  private Manager manager;
  //   todo  make two classes of past and future
  //    private List<Game> gamesPlayed;
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

  public List<Game> getGamesInFuture() {
    return gamesInFuture;
  }

  public void setGamesInFuture(List<Game> gamesInFuture) {
    this.gamesInFuture = gamesInFuture;
  }
}
