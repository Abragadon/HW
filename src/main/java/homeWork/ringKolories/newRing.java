package homeWork.ringKolories;

public class newRing {
    public static void main(String[] args) {

        int x = 24;
        double area = (Math.PI * (x * x) /4);
        int kol = (int) (area * 40);

        int y = 28;
        double area2 = (Math.PI * (y * y) /4);
        int kol2 = (int) (area2 * 40);

        int finalKol = kol2 - kol;

        System.out.println("Вы съедите на: " + finalKol + " больше калорий");

    }
}
