package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        int sizeOfInput = input.length;
        int[] result = new int[sizeOfInput];

        int pointerOne = 0;
        int pointerTwo = sizeOfInput - 1;
        for (int i = sizeOfInput - 1; i > -1; i--) {
            if (Math.abs(input[pointerOne]) > Math.abs(input[pointerTwo])) {
                result[i] = input[pointerOne] * input[pointerOne];
                pointerOne++;
            } else {
                result[i] = input[pointerTwo] * input[pointerTwo];
                pointerTwo--;
            }
        }
        return result;
    }
}
