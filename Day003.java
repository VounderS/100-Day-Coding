public class Day003 {
    public static void main(String[] args) {
        String nama, umur, tempatLahir;

        nama = "Joko";
        umur = "17";
        tempatLahir = "Talumung";
        perkenalanDiri(nama, umur, tempatLahir);
    }

    public static void perkenalanDiri(String nama, String umur, String tempatLahir) {
        System.out.println(
                "Perkenalkan nama saya " + nama + " umur saya " + umur + " tahun saya lahir di " + tempatLahir);
    }
}
