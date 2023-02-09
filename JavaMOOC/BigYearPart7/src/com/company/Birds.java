package com.company;

public class Birds {
    private String name;
    private String latinName;
    private int observations = 0;


    public Birds(String name, String latinName, int observations) {
        this.name = name;
        this.latinName = latinName;
        this.observations = observations;
    }

    public Birds(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservations(){
        return this.observations;
    }

    public void addObservation(){
        observations++;
    }


    public boolean nameContains(String searchWord) {
        return this.name.contains(searchWord);
    }
}
