
public class Day007 {
    public static void main(String[] args) {
        penjumlahanMatrix();
    }

    public static void penjumlahanMatrix() {
        int[][] matrixA = { { 1, 2 }, { 1, 2 } };
        int[][] matrixB = { { 1, 2 }, { 1, 2 } };
        int[][] result = new int[2][2];
        int matrixALength = matrixA.length;
        int matrixBLength = matrixB.length;
        for (int i = 0; i < matrixALength; i++) {
            for (int j = 0; i < matrixBLength; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Hasil Penjumlahan Matriks: ");
        for (int i = 0; i < matrixALength; i++) {
            for (int j = 0; j < matrixBLength; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
