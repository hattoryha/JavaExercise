import java.util.Scanner;

public class ExerciseDayArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang");
        int n = scanner.nextInt();
        int[] intergerNumbers = new int[n];
        for (int i = 0; i < intergerNumbers.length; i++) {
            System.out.println("nhap gia tri phan tu thu " + i);
            intergerNumbers[i] = scanner.nextInt();

        }

        for (int i = 0; i < intergerNumbers.length; i++) {
            if (i == 0) {
                System.out.print("{" + intergerNumbers[i] + ", ");
            } else if (i == intergerNumbers.length - 1) {
                System.out.print(intergerNumbers[i] + "}");
            } else System.out.print(intergerNumbers[i] + ", ");

        }
        for (int num : intergerNumbers
        ) {
            if (num % 2 == 0) {
                num = num + 1;
            }
        }
        for (int i = 0; i < intergerNumbers.length; i++) {
            if (intergerNumbers[i] % 2 == 0) {
                intergerNumbers[i] += 1;
            }

        }
        for (int i = 0; i < intergerNumbers.length; i++) {
            if (i == 0) {
                System.out.print("{" + intergerNumbers[i] + ", ");
            } else if (i == intergerNumbers.length - 1) {
                System.out.print(intergerNumbers[i] + "}");
            } else System.out.print(intergerNumbers[i] + ", ");

        }


    }
}
