import java.util.Scanner;

public class Diamond {
    public void createDia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Tek Sayı Giriniz : ");
        int n = scanner.nextInt(); //odd number
        for (int i = 0; i < (n / 2 + 1); i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
