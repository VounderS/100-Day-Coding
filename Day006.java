
//Calculator Sederhana
import java.util.Scanner;

public class Day006 {
    public static void main(String[] args) {
        looping();
    }

    public static double penjumlahan(double nilai1, double nilai2) {
        return nilai1 + nilai2;
    }

    public static double pengurangan(double nilai1, double nilai2) {
        return nilai1 - nilai2;
    }

    public static double pembagian(double nilai1, double nilai2) {
        return nilai1 / nilai2;
    }

    public static double perkalian(double nilai1, double nilai2) {
        return nilai1 * nilai2;
    }

    public static void looping() {
        while (true) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print(
                    "1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Keluar Program\nMasukkan perintah anda : ");
            int pilihan = inputScanner.nextInt();
            char simbol;
            if (pilihan == 1) {
                simbol = '+';
                System.out.print("Masukkan nilai pertama : ");
                int nilai1 = inputScanner.nextInt();
                System.out.print("Masukkan nilai kedua : ");
                int nilai2 = inputScanner.nextInt();
                System.out
                        .println("Hasil dari " + nilai1 + simbol + nilai2 + " : " + penjumlahan(nilai1, nilai2) + "\n");

            } else if (pilihan == 2) {
                simbol = '-';
                System.out.print("Masukkan nilai pertama : ");
                int nilai1 = inputScanner.nextInt();
                System.out.print("Masukkan nilai kedua : ");
                int nilai2 = inputScanner.nextInt();
                System.out
                        .println("Hasil dari " + nilai1 + simbol + nilai2 + " : " + pengurangan(nilai1, nilai2) + "\n");

            } else if (pilihan == 3) {
                simbol = '*';
                System.out.print("Masukkan nilai pertama : ");
                int nilai1 = inputScanner.nextInt();
                System.out.print("Masukkan nilai kedua : ");
                int nilai2 = inputScanner.nextInt();
                System.out.println("Hasil dari " + nilai1 + simbol + nilai2 + " : " + perkalian(nilai1, nilai2) + "\n");

            } else if (pilihan == 4) {
                simbol = '*';
                System.out.print("Masukkan nilai pertama : ");
                int nilai1 = inputScanner.nextInt();
                System.out.print("Masukkan nilai kedua : ");
                int nilai2 = inputScanner.nextInt();
                System.out.println("Hasil dari " + nilai1 + simbol + nilai2 + " : " + pembagian(nilai1, nilai2) + "\n");

            } else {
                break;
            }
        }
    }
}