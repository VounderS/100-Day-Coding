public class Day012 {
    public static void main(String[] args) {
        int array[] = { 2, 4, 3, 7, 1, 4, 1 };
        System.out.print("Before Sorting : ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        bubbleSort(array);
 
    }

    public static void bubbleSort(int[] array) {
        int arrayLenght = array.length;
        for (int i = 0; i < arrayLenght - 1; i++) {
            for (int j = 0; j < arrayLenght - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("\nAfter Sorting : ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
