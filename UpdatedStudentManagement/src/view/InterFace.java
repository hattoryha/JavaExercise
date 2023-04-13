package view;

import entity.ClassManager;
import entity.ClassRoom;
import entity.Student;
import entity.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class InterFace {
    public void DisplayAllCentre(ClassManager classManager, Teacher teacher, ClassRoom classRoom){
        System.out.println(classManager.toString()+teacher.toString()+classRoom.toString());
    }
}
