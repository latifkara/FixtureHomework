package com.javaGelisme;

import java.util.ArrayList;
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
        List<String> newList = new ArrayList<String>();

        for (int i=1; i <= 10; i++){

        }
    }

    public static String getRandom(List<String> array){
        int rnd = new Random().nextInt(array.size());
        return array.get(rnd);
    }

    public static void selectFirstRandom(){

    }
}
