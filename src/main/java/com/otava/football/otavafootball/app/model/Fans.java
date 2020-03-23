package com.otava.football.otavafootball.app.model;

import javax.persistence.*;

@Entity
@Table(name = "fans")
public class Fans {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "fans_id", unique = true, nullable = false)
  private Integer fansId;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "club_id")
  private Club club;

  @Column(name = "name")
  private String name;

  @Column(name = "count")
  private Integer count;

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

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }
}
