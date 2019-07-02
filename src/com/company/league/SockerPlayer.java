package com.company.league;

public interface SockerPlayer {

    String getNickName();

    Integer getPoints();

    League getLeague();

    Country getCountry();

    void addPoints(int points);
}
