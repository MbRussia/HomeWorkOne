package com.company.league;

import java.util.List;

public interface LeagueManager {

    void addPlayer(SockerPlayer player);

    void removePlayer(SockerPlayer player);

    SockerPlayer getPlayer(String name);

    List<SockerPlayer> getAllPlayers();

    List<SockerPlayer> getPlayers(League league);

    List<SockerPlayer> getPlayers(Country country);

    void addPoints(String name, int points);


}
