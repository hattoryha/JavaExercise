import entity.ClassManager;
import entity.ClassRoom;
import entity.Teacher;
import handle.ClassManagerHandle;
import handle.ClassRoomHandle;
import handle.StudentHandle;
import handle.TeacherHandle;
import view.InterFace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ClassRoomHandle classRoomHandle = new ClassRoomHandle();
        ClassManagerHandle classManagerHandle = new ClassManagerHandle();
        StudentHandle studentHandle =new StudentHandle();
        TeacherHandle teacherHandle = new TeacherHandle();
        ClassManager classManager = classManagerHandle.CreateClassManager(scanner);
        Teacher teacher = teacherHandle.CreateTeacher(scanner);
        ClassRoom classRoom = classRoomHandle.CreateClassRoom(scanner);
        InterFace interFace =new InterFace();
        interFace.DisplayAllCentre(classManager,teacher,classRoom);
        classRoomHandle.UpdateStudentInforById(scanner,classRoom);
        classRoomHandle.RemoveStudentInforByName(scanner,classRoom);
        classRoomHandle.AddStudentToClassRoom(scanner,classRoom);
    }
}
