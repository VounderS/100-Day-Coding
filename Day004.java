public class Day004 {
    public static void main(String[] args) {
        nilaiHurufKeAngka('A');
    }

    public static void nilaiHurufKeAngka(char huruf) {
        double result = 0;
        if (huruf == 'A') {
            result = 4.0;
        } else if (huruf == 'B') {
            result = 3.0;
        } else if (huruf == 'C') {
            result = 2.0;
        } else if (huruf == 'D') {
            result = 1.0;
        } else {
            result = 0.0;
        }
        System.out.println("Nilai angka anda : " + result);
    }
}
