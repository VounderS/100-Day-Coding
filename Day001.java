public class Day001 {
    public static void main(String[] args) {
        int sisi;
        sisi = 5;
        System.out.println("Luas persegi yang memiliki sisi " + sisi + "cm : " + menghitungLuasPersegi(sisi) + "cm");

    }

    public static int menghitungLuasPersegi(int a) {
        return a * a;
    }
}
