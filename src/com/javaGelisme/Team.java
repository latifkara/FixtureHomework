package com.javaGelisme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Team {
    private List<String> teams = new ArrayList<String>();
    public Team(){
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahce");
        teams.add("Besiktas");
        teams.add("Basaksehir");
        teams.add("Trabzonspor");
    }

    public void option(){
        for (int i=1; i <= 10; i++){
            System.out.println("Round "+i);
            selectFirstRandom(this.teams);
        }
    }

    public static String getRandom(List<String> array){
        int rnd = new Random().nextInt(array.size());
        return array.get(rnd);
    }

    public static void selectFirstRandom(List<String> array){
        int count = 0;
        List<String> newList = new ArrayList<String>();
        do {
            String firstTeam = getRandom(array);
            String secondTeam = getRandom(array);
            if (!firstTeam.equalsIgnoreCase(secondTeam) && (!newList.contains(firstTeam) && !newList.contains(secondTeam))){
                System.out.println(firstTeam + " VS "+ secondTeam);
                newList.add(firstTeam);
                newList.add(secondTeam);
                count++;
            }
        }while (count < 3);
    }
}
