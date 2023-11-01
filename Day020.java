public class Day020 {
    static class Manusia {
        int umur;
        String nama;

        void perkenalan() {
            System.out.println("Perkenalkan nama saya " + nama + " umur saya " + umur);
        }

        public Manusia(int umur, String nama) {
            this.umur = umur;
            this.nama = nama;
        }

    }

    public static void main(String[] args) {
        Manusia manusia1 = new Manusia(18, "Joko");

        manusia1.perkenalan();
    }
}
