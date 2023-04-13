package handle;



import entity.Figure;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamHandle {
    public Team CreateTeam(Scanner scanner){
        System.out.println("moi ban nhap ten Team");
        String name = scanner.nextLine();
        FigureHandle figureHandle = new FigureHandle();
        ArrayList<Figure> figures = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            figures.add(figureHandle.CreateFigure(scanner));
        }
        return new Team(name, figures);
}
}
