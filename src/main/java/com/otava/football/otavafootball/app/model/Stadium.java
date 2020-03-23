package com.otava.football.otavafootball.app.model;

import javax.persistence.*;

@Entity
@Table(name = "stadium")
public class Stadium {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "stadium_id", unique = true, nullable = false)
  private Integer stadiumId;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "club_id")
  private Club club;

  @Column(name = "name")
  private String name;

  @Column(name = "seats")
  private Integer seats;

  public Integer getStadiumId() {
    return stadiumId;
  }

  public void setStadiumId(Integer stadiumId) {
    this.stadiumId = stadiumId;
  }

  public Club getClub() {
    return club;
  }

  public void setClub(Club club) {
    this.club = club;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getSeats() {
    return seats;
  }

  public void setSeats(Integer seats) {
    this.seats = seats;
  }
}
