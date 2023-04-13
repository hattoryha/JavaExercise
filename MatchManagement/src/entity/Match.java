package entity;

import java.util.ArrayList;

public class Match {
    private String name;
    private ArrayList<Team> teams;

    public Match(String name, ArrayList<Team> teams) {
        this.name = name;
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "Match{" +
                "name='" + name + '\'' +
                ", teams=" + teams +
                '}';
    }
}
