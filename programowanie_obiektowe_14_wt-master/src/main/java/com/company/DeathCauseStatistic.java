package com.company;
import java.nio.file.Path;
import java.security.Key;
import java.util.List;
import java.util.Objects;

public class DeathCauseStatistic {
    private String deathCode;
    private int[] deathCounter= new int[20];

    public String getDeathCode() {
        return deathCode;
    }

    public static DeathCauseStatistic fromCsvFile(String line){
        String[] args = line.split(",");
        DeathCauseStatistic output = new DeathCauseStatistic();
        output.deathCode=args[0].trim();
        for(int i = 0; i<20;i++){
            if(args[i+2].equals("-")){
                output.deathCounter[i]=0;
            }
            else {
                output.deathCounter[i] = Integer.parseInt(args[i + 2]);
            }
        }
        return output;
    }

    // W klasie DeathCauseStatistic napisz metodę przyjmującą wiek i zwracającą obiekt AgeBracketDeaths odpowiadający temu wiekowi.
    AgeBracketDeaths getAgeBracketDeaths(int age) {
        if(age > 95) {
            age = 95;
        }

        int index = age / 5;
        int min = age / 5 * 5;
        int max = age / 5 * 5 + 4;

        final int deaths = deathCounter[index];
        return new AgeBracketDeaths(min, max, deaths);
    }

    public class AgeBracketDeaths {
        public final int young, old, deathCount;

        public AgeBracketDeaths(int young, int old, int deathCount) {
            this.young = young;
            this.old = old;
            this.deathCount = deathCount;
        }
    }

}