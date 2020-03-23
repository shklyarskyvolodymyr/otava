package com.otava.football.otavafootball.app.model;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "game_id", unique = true, nullable = false)
  private Integer gameId;

  @OneToMany(mappedBy = "team")
  private Team homeTeam;

  @OneToMany(mappedBy = "team")
  private Team awayTeam;
  //    todo nested classes qwith goals and cards

  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public Team getHomeTeam() {
    return homeTeam;
  }

  public void setHomeTeam(Team homeTeam) {
    this.homeTeam = homeTeam;
  }

  public Team getAwayTeam() {
    return awayTeam;
  }

  public void setAwayTeam(Team awayTeam) {
    this.awayTeam = awayTeam;
  }
}
