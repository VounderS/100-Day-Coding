import java.util.Scanner;

public class Day008 {
    public static void main(String[] args) {
        belanja();
    }

    public static void belanja() {
        Scanner inputScanner = new Scanner(System.in);
        int totalBarang = 0, harga = 0;

        while (true) {
            System.out
                    .print(
                            "======Tambah ke keranjang======\n1. Sayur Mayur : 5rb\n2. Kecap : 10rb\n3. Bawang : 3rb\n4. Bayar Barang Belanja\nMasukkan Perintah Anda: ");
            int pilihan = inputScanner.nextInt();
            if (pilihan == 1) {
                totalBarang += 1;
                harga += 5000;
                System.out
                        .println("Sayur dan mayur ditambahkan ke keranjang total barang anda adalah : " + totalBarang);
                System.out.println("Total bayar : " + harga);
            } else if (pilihan == 2) {
                totalBarang += 1;
                harga += 10000;
                System.out
                        .println("Sayur dan mayur ditambahkan ke keranjang total barang anda adalah : " + totalBarang);
                System.out.println("Total bayar : " + harga);
            } else if (pilihan == 3) {
                totalBarang += 1;
                harga += 3000;
                System.out
                        .println("Sayur dan mayur ditambahkan ke keranjang total barang anda adalah : " + totalBarang);
                System.out.println("Total bayar : " + harga);
            } else {
                break;
            }
        }
        System.out.println("Total Belanja Anda : " + harga);
        System.out.println("Total Bayar Setelah Diskon 30% : " + menghitungDiskon(harga));
    }

    public static double menghitungDiskon(double harga) {
        double diskon = harga * 0.3;
        double total = harga - diskon;
        return total;
    }
}
