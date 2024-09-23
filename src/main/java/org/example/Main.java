public class Main {
    public static int[] findEvenNumbers(int[] inputArray, int count) {
        // Tæl hvor mange lige tal der er
        int evenCount = 0;
        for (int i = 0; i < count; i++) {
            if (inputArray[i] % 2 == 0) {
                evenCount++;
            }
        }

        // Opret et array til de lige tal
        int[] evenNumbers = new int[evenCount];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (inputArray[i] % 2 == 0) {
                evenNumbers[index++] = inputArray[i];
            }
        }

        return evenNumbers;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = findEvenNumbers(array, array.length);

        System.out.println("Lige tal i arrayet: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}
