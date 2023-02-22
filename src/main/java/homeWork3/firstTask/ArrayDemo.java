package homeWork3.firstTask;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        RandomNumbers random = new RandomNumbers();

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.randomNumbers(1, 50);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length ; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));



    }
}
