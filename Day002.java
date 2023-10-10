public class Day002 {
    public static void main(String[] args) {
        double alas, tinggi;
        double sisi;

        sisi = 5.0;
        System.out.println(
                "Luas persegi yang memiliki sisi " + sisi + "cm adalah : " + menghitungLuasPersegi(sisi) + "cm");

        alas = 5.0;
        tinggi = 5.0;
        System.out.println("Luas segitiga yang memiliki alas " + alas + "cm dan tinggi " + tinggi + "cm adalah : "
                + menghitungLuasPersegi(sisi) + "cm");

    }

    public static double menghitungLuasPersegi(double a) {
        return a * a;
    }

    public static double menghitungLuasSegitiga(double alas, double tinggi) {
        return 1 / 2 * alas * tinggi;
    }
}
