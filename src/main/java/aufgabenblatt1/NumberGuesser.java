package aufgabenblatt1;

import java.io.InputStream;
import java.util.Scanner;

public class NumberGuesser {
    private int number;
    public NumberGuesser(int targetNumber){
        number = targetNumber;

    }
    public boolean isBigger(int guess){

        if (guess < number){

            return false;
        }
        if(guess > number){

            return true;
        }
        return false;

    }
    public void guess(){

        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i>-1;i++){

            System.out.println("Rate die Zahl!");
            int guess = scanner.nextInt();
            isBigger(guess);
            if(isGleich(guess)){
                System.out.println("Gefunden! " + guess);
                break;
            }
            if(isBigger(guess)){
                System.out.println("Die Zahl " + guess + " ist groeßer als die Ziel Zahl!");
            }else {
                System.out.println("Die Zahl " + guess + " ist kleiner als die Ziel Zahl!");
            }

        }
        scanner.close();


    }
    public void autoGuess(){
        int max = 100;
        int min = 0;
        int guess = 50;
        for (int i = 0;i>-1;i++){

            System.out.println("Rate die Zahl!");

            isBigger(guess);
            if(isGleich(guess)){
                System.out.println("Gefunden! " + guess);
                break;
            }
            if(isBigger(guess)){
                System.out.println("Die Zahl " + guess + " ist groeßer als die Ziel Zahl!");
                max = guess;


            }else {
                System.out.println("Die Zahl " + guess + " ist kleiner als die Ziel Zahl!");

                min = guess;


            }
            guess = (min + max) / 2;

        }


    }
    private boolean isGleich(int guess){
        if (isBigger(guess + 1) && !isBigger(guess)){
            return true;
        }
        return false;
    }
}
