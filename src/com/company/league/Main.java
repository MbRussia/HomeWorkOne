package com.company.league;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        LeagueManager manager = new LeagueManagerImpl();

        for (int i = 0; i < 10; i++) {
            manager.addPlayer(new SockerPlayerImpl("NickName" + i, rnd.nextInt(20), getRndLeague(), getRndCountry()));
        }
        for (int i = 0; i < Country.values().length; i++) {
            List<SockerPlayer> l1 = manager.getPlayers(Country.values()[i]);
            l1.sort(new Comparator<SockerPlayer>() {
                @Override
                public int compare(SockerPlayer socker1, SockerPlayer socker2) {
                    return socker2.getPoints().compareTo(socker1.getPoints());
                }
            });
            System.out.println(l1);
        }

    }

    private static Country getRndCountry() {
        int i = rnd.nextInt(Country.values().length);
        return Country.values()[i];
    }

    private static League getRndLeague() {
        int i = rnd.nextInt(League.values().length);
        return League.values()[i];
    }
}
