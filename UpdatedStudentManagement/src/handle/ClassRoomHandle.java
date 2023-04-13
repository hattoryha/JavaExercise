package handle;

import entity.ClassRoom;
import entity.Student;
import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomHandle {
    public ClassRoom CreateClassRoom(Scanner scanner){
        System.out.println("moi ban nhap ten mon hoc cua class");
        String subject = scanner.nextLine();
        System.out.println("moi ban nhap so luong hoc vien");
        int numberOfStudent = Integer.parseInt(scanner.nextLine());
        StudentHandle studentHandle =new StudentHandle();
        ArrayList <Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudent; i++) {
            students.add(studentHandle.CreateStudent(scanner));
        }

        return new ClassRoom(subject,students);
    }
    public void AddStudentToClassRoom(Scanner scanner, ClassRoom classRoom){
        System.out.println("moi ban nhap so luong hoc vien muon them");
        int numberOfNewStudent = Integer.parseInt(scanner.nextLine());
        StudentHandle studentHandle =new StudentHandle();
        ArrayList <Student> newStudents = new ArrayList<>();
        for (int i = 0; i < numberOfNewStudent; i++) {
            newStudents.add(studentHandle.CreateStudent(scanner));
        }
        ArrayList <Student> students = new ArrayList<>();
        students = classRoom.getStudents();
        students.addAll(newStudents);
        classRoom.setStudents(students);
    }
    public void UpdateStudentInforById(Scanner scanner, ClassRoom classRoom){
        System.out.println("moi ban nhap ID hoc vien: ");
        int findingStudentId = Integer.parseInt(scanner.nextLine());
        System.out.println("moi ban nhap hoc luc hien tai cua ban hoc vien do");
        String currrentLearningCapacity = scanner.nextLine();
        for (Student student: classRoom.getStudents()
             ) {
            if(student.getId() == findingStudentId){
                student.setLearningCapacity(currrentLearningCapacity);
                break;
            }
        }
    }
    public void RemoveStudentInforByName(Scanner scanner, ClassRoom classRoom){
        System.out.println("moi ban nhap ten cua hoc vien xin nghi");
        String findingName = scanner.nextLine();
        ArrayList <Student> students = new ArrayList<>();
        students = classRoom.getStudents();
        for (Student student: classRoom.getStudents()
        ) {
            if(student.getName().equals(findingName)){
                students.remove(student);
                classRoom.setStudents(students);
                break;
            }
        }
    }
}
