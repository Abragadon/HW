package homeWork.words;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstWord;
        String secondWord;

        do {
            System.out.print("Type first word: ");
            firstWord = scan.nextLine();
        } while (firstWord.length()%2 != 0);
        System.out.println("Your word has: " + firstWord.length() + " letters");

        do {
            System.out.print("Type second word: ");
            secondWord = scan.nextLine();
        } while (secondWord.length()%2 != 0);

        System.out.println("You word has " + secondWord.length() + " letters");

        String newFirstWord = firstWord.substring(0,firstWord.length()/2);

        String newSecondWord = secondWord.substring(secondWord.length()/2,secondWord.length());

        System.out.print("New Word: " +newFirstWord+newSecondWord);



    }
}
