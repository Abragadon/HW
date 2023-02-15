package homeWork2.thirdTask;

public class Flask {
    public static void main(String[] args) {

        int Temperature1 = 150;

        int Temperature2 = 50;

        System.out.println("You system is work correct: " + temp(Temperature1,Temperature2));

    }

       public static boolean temp (int Temperature1, int Temperature2){
        return (Temperature1 > 100) && (Temperature2 < 100);
       }

}
