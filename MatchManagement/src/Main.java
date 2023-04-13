import entity.Match;
import handle.FigureHandle;
import handle.MatchHandle;
import handle.TeamHandle;
import view.InterFace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        FigureHandle figureHandle = new FigureHandle();
        MatchHandle matchHandle = new MatchHandle();
        TeamHandle teamHandle = new TeamHandle();
        InterFace interFace = new InterFace();
        Match match = matchHandle.CreateMatch(scanner);
        interFace.DisplayAllTeam(match);
    }
}
