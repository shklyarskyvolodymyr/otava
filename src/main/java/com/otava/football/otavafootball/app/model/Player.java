package com.otava.football.otavafootball.app.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "player")
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "player_id", unique = true, nullable = false)
  private Integer playerId;

  @Column(name = "name")
  private String name;

  @Column(name = "number")
  private Byte number;

  @Column(name = "born_date")
  private Date bornDate;

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

  @Column(name = "position")
  private String position;

  @Column(name = "goal_keeping")
  private byte goalkeeping;

  @Column(name = "defending")
  private byte defending;

  @Column(name = "middlefield")
  private byte Middlefield;

  @Column(name = "attack")
  private byte attack;

  @Column(name = "shoots")
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
