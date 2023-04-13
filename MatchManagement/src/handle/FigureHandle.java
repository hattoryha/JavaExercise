package handle;

import entity.Figure;

import java.util.Scanner;

public class FigureHandle {
    public Figure CreateFigure(Scanner scanner){
        System.out.println("moi ban nhap ten tuong");
        String name = scanner.nextLine();
        System.out.println("moi ban nhap vi tri tuong");
        String position = scanner.nextLine();
        return new Figure(name, position);

    }

}
