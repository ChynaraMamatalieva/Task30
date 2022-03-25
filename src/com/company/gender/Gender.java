package com.company.gender;

public enum Gender {
    MALE('M'),
    FEMALE('W');

    private char gen;

    Gender(char gen) {
        this.gen = gen;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Gender: " +
                "gen: " + gen;
    }
}
