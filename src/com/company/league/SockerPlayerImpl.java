package com.company.league;

public class SockerPlayerImpl implements SockerPlayer {
    private String nickName;
    private int points;
    private League league;
    private Country country;

    public SockerPlayerImpl(String nickName, int points, League league, Country country) {
        this.nickName = nickName;
        this.points = points;
        this.league = league;
        this.country = country;
    }

    @Override
    public String getNickName() {
        return nickName;
    }

    @Override
    public Integer getPoints() {
        return points;
    }

    @Override
    public League getLeague() {
        return league;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SockerPlayerImpl{");
        sb.append("nickName='").append(nickName).append('\'');
        sb.append(", points=").append(points);
        sb.append(", league=").append(league);
        sb.append(", country=").append(country);
        sb.append("}\n");
        return sb.toString();
    }
}

