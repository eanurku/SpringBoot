package com;

public class RaceToScore {

    private boolean isThresholdReached = false;
    private Score   score;

    public RaceToScore(Score score) {
        this.isThresholdReached = isThresholdReached;
        this.score = score;
    }

    public static RaceToScore copyOf(RaceToScore rc) {
        Score newScore = Score.copyof(rc.getScore());
        RaceToScore newRc = new RaceToScore(newScore);
        newRc.setThresholdReached(rc.isThresholdReached());
        return newRc;
    }

    public boolean isThresholdReached() {
        return isThresholdReached;
    }

    public void setThresholdReached(boolean thresholdReached) {
        isThresholdReached = thresholdReached;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "RaceToScore{" +
                "isThresholdReached=" + isThresholdReached +
                ", score=" + score +
                '}';
    }
}
