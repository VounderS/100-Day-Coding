public class Day013 {//
    public static void main(String[] args) {
        int array[] = { 2, 4, 3, 7, 1, 4, 1 };
        System.out.print("Before Sorting : ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        selectionSort(array);

    }

    public static void selectionSort(int[] array) {
        int arrayLenght = array.length;
        for (int i = 0; i < arrayLenght - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrayLenght; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.print("\nAfter Sorting : ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
