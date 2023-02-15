package homeWork2.fistTask;

public class FirstTask {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;

        System.out.println(canWalk);
    }
}