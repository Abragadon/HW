package homeWork3.secondTask;

import java.util.Arrays;
import java.util.Random;

public class SecondTask {
    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumbers(10, 99);
        }

        System.out.println(Arrays.toString(array));

        boolean num = true;
        for (int i = 1; i < array.length; i++) {
            if(array[i] <= array[i-1]){
                num = false;
                break;
            }
        }

        if(num) {
            System.out.println("Массив является возрастающей последовательностью");
        }
        else {
            System.out.println("Массив не является возрастающей последовательностью");
        }


    }


    static int randomNumbers(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
