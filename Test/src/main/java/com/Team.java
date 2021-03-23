package com;


public enum Team {
    HOME("Home", 0),
    AWAY("Away", 1),
    NO_TEAM("No Team", -1);

    private final String name;
    private final int    id;

    Team(final String name, final int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static Team getTeamById(final int id) {
        for (Team team : Team.values()) {
            if (team.id == id) {
                return team;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}