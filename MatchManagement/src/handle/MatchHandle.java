package handle;

import entity.Figure;
import entity.Match;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class MatchHandle {
    public Match CreateMatch(Scanner scanner){
        System.out.println("moi ban nhap ten Match");
        String name = scanner.nextLine();
        FigureHandle figureHandle = new FigureHandle();
        TeamHandle teamHandle = new TeamHandle();

        ArrayList<Team> teams = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            teams.add(teamHandle.CreateTeam(scanner));
        }
        return new Match(name, teams);
    }
}
