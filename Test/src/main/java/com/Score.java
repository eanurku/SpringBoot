package com;

public class Score {
   int home;
    int away;

    public Score(int home, int away) {
        this.home = home;
        this.away = away;
    }
    public static Score of(int home, int away) {
        return new Score(home,away);
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public static Score copyof(Score sc){
        return Score.of(sc.getHome(),sc.getAway());
    }

    public int getAway() {
        return away;
    }

    public void setAway(int away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return "Score{" +
                "home=" + home +
                ", away=" + away +
                '}';
    }
}
