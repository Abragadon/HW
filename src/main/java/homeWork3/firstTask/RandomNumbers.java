package homeWork3.firstTask;

import java.util.Random;

public class RandomNumbers {
    public int randomNumbers(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) +min;
    }
}
