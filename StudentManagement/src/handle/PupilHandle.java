package handle;

import entity.Pupil;

import java.util.Scanner;

public class PupilHandle {
    public Pupil createPupil(Scanner scanner, int i) {
        System.out.println("Mời b nhập vào tên sp thứ " + (i + 1));
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("So luong: ");
        int amount = Integer.parseInt(scanner.nextLine());
        return new Pupil(name, price, amount);
    }

    public Pupil[] createManyPupils(Scanner scanner, int PupilNumber) {
        Pupil[] Pupils = new Pupil[PupilNumber];
        for (int i = 0; i < PupilNumber; i++) {
            Pupil Pupil = createPupil(scanner, i);
            Pupils[i] = Pupil;
        }
        return Pupils;
    }


    public void displayAllPupils(Pupil[] Pupils) {
        for (Pupil p : Pupils
        ) {
            System.out.println(p);
        }
    }
}
