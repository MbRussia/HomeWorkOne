package com.company.league;

import java.util.ArrayList;
import java.util.List;

public class LeagueManagerImpl implements LeagueManager {
    private List<SockerPlayer> players = new ArrayList<>();

    @Override
    public void addPlayer(SockerPlayer player) {
        players.add(player);
    }

    @Override
    public void removePlayer(SockerPlayer player) {
        players.remove(player);
    }

    @Override
    public SockerPlayer getPlayer(String name) {
        for (int i = 0; i < players.size(); i++) {
            SockerPlayer player = players.get(i);
            if (player.getNickName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    @Override
    public List<SockerPlayer> getAllPlayers() {

        return players;
    }

    @Override
    public List<SockerPlayer> getPlayers(League league) {
        List<SockerPlayer> players = new ArrayList<>();
        if (this.players.isEmpty()) {
            return null;
        }

        for (int i = 0; i < this.players.size(); i++) {
            SockerPlayer player = this.players.get(i);
            if (player.getLeague().equals(league)) {
                players.add(player);
            }
        }

        if (players.isEmpty()) {
            return null;
        }
        return players;
    }

    @Override
    public List<SockerPlayer> getPlayers(Country country) {
        List<SockerPlayer> players = new ArrayList<>();
        if (this.players.isEmpty()) {
            return null;
        }

        for (int i = 0; i < this.players.size(); i++) {
            SockerPlayer player = this.players.get(i);
            if (player.getCountry().equals(country)) {
                players.add(player);
            }
        }

        if (players.isEmpty()) {
            return null;
        }
        return players;
    }

    @Override
    public void addPoints(String name, int points) {
        for (int i = 0; i < players.size(); i++) {
            SockerPlayer player = players.get(i);
            if (player.getNickName().equals(name)) {
                player.addPoints(points);
            }
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LeagueManagerImpl{");
        sb.append("players=").append(players);
        sb.append('}');
        return sb.toString();
    }
}
